public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        String[] Maanden = {"Januari", "February", "Maart", "April", "Mei"};
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(Maanden[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }

    }
}
