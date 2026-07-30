# 📒 12 — Input/Output

Reading and writing files is where a Java program finally touches the outside world. This module walks through the classic `java.io` classes (File, FileWriter, FileReader, the Buffered wrappers) and the modern `java.nio.file` API (Path, Files), with one small runnable example per concept. Every example works exclusively inside the system temp directory, so you can run them as often as you like without leaving files behind.

> 🇳🇱 Bestanden lezen en schrijven is het moment waarop een Java-programma de buitenwereld raakt. Deze module behandelt de klassieke `java.io`-klassen (File, FileWriter, FileReader, de Buffered-wrappers) en de moderne `java.nio.file`-API (Path, Files), met per concept een klein uitvoerbaar voorbeeld. Elk voorbeeld werkt uitsluitend in de tijdelijke map van het systeem, zodat je ze onbeperkt kunt uitvoeren zonder bestanden achter te laten.

## 📖 Theory in short

- **Streams vs readers/writers** — `InputStream`/`OutputStream` move raw **bytes** (images, zips, any binary data); `Reader`/`Writer` move **characters** and handle the encoding for you. Rule of thumb: text → Reader/Writer, everything else → streams.
- **Byte vs char** — a `char` is not a byte: text must be *decoded* from bytes using a charset (ideally explicit UTF-8). Mixing the two levels up is the classic source of garbled text (mojibake).
- **Buffering** — `BufferedReader`/`BufferedWriter` batch small reads/writes into big blocks in memory. Dramatically faster than unbuffered I/O, and they add `readLine()` and `newLine()` on top.
- **try-with-resources** — every stream/reader/writer must be closed. `try (var r = new FileReader(f)) { ... }` closes automatically, even when an exception flies, and replaces the old `finally`-with-null-checks dance. Multiple resources close in reverse order.
- **NIO `Files`** — the modern toolbox: `Files.readAllLines`, `Files.write`, `Files.exists`, `Files.deleteIfExists`, `Files.createDirectories`. One-liners for the 90% case; fall back to buffered streams for huge files.

## 🗂️ File map

| File | Concept |
|---|---|
| `src/LabWerk.java` | Lab exercise: create a folder + files, write a message, save and re-read a simple `Animal` object as CSV-style text |
| `src/io/BestandEnPadBasis.java` | `File` vs `Path` basics: names, absolute paths, `resolve()` instead of string concatenation |
| `src/io/FileWriterFileReaderVoorbeeld.java` | Plain `FileWriter`/`FileReader`: unbuffered character I/O, reading char by char |
| `src/io/BufferedReaderWriterVoorbeeld.java` | `BufferedWriter`/`BufferedReader`: buffering, `newLine()`, `readLine()` until `null` |
| `src/io/TryWithResourcesVoorbeeld.java` | Idiomatic try-with-resources with multiple resources; old style shown for contrast |
| `src/io/NioFilesVoorbeeld.java` | `Files.write` / `Files.readAllLines` / `Files.size`: whole-file operations in one call |
| `src/io/ScannerUitBestand.java` | `Scanner` on a file: parsing words and numbers while reading (`next()`, `nextInt()`) |
| `src/io/ToevoegenAanBestand.java` | Appending: `new FileWriter(file, true)` and `StandardOpenOption.APPEND` |
| `src/io/BestaatEnVerwijderen.java` | `Files.exists`, safe deletion with `deleteIfExists` vs exception-throwing `delete` |

Compile and run any example from `12-io/src`:

```bash
javac -d out io/NioFilesVoorbeeld.java && java -cp out io.NioFilesVoorbeeld
```

## ⚠️ Pitfalls & interview notes

- **Forgetting to close** a stream leaks file handles; on Windows the file stays locked. Interviewers expect try-with-resources as the default answer.
- **`FileWriter` overwrites by default** — appending requires the explicit `true` flag or `StandardOpenOption.APPEND`.
- **`read()` returns `int`, not `char`** — the extra range is needed for the `-1` end-of-file marker; cast to `char` only after checking.
- **`readLine()` strips the line terminator** and returns `null` (not an empty string) at end of file — the standard loop is `while ((line = br.readLine()) != null)`.
- **Default charset trap** — `new FileReader(f)` historically used the platform charset (fixed to UTF-8 only since Java 18). Pass `StandardCharsets.UTF_8` explicitly in production code.
- **`Files.delete` vs `deleteIfExists`** — the first throws `NoSuchFileException` when the file is missing; the second returns `false`. Know which one you want.
- **Checked exceptions** — nearly everything in `java.io`/`java.nio.file` throws `IOException`; you must catch it or declare it, which is a favourite interview follow-up on checked vs unchecked exceptions.
- **Hardcoded absolute paths** (`C:\Users\...`) break on every other machine — build paths from a base like `System.getProperty("java.io.tmpdir")` or `user.home` and `resolve()`.
