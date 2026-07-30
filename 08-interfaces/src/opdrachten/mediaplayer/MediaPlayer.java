package opdrachten.mediaplayer;

/** Het contract dat de client (AudioPlayer) verwacht. */
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
