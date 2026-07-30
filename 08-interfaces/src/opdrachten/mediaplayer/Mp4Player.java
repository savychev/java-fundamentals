package opdrachten.mediaplayer;

/** Kan alleen MP4 afspelen; playVlc blijft bewust leeg. */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        // bewust leeg: dit toestel ondersteunt geen VLC
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file. Name: " + fileName);
    }
}
