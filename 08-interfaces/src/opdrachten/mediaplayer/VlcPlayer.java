package opdrachten.mediaplayer;

/** Kan alleen VLC afspelen; playMp4 blijft bewust leeg. */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // bewust leeg: dit toestel ondersteunt geen MP4
    }
}
