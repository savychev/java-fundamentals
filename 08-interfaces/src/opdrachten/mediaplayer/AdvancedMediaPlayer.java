package opdrachten.mediaplayer;

/** Het "vreemde" contract dat niet compatibel is met MediaPlayer. */
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
