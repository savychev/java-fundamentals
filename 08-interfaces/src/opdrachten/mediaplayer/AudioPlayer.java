package opdrachten.mediaplayer;

/**
 * De client: speelt mp3 zelf af en delegeert mp4/vlc aan de adapter.
 */
public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equals("mp3")) {
            System.out.println("Playing MP3 file. Name: " + fileName); // ingebouwde ondersteuning
        } else if (audioType.equals("mp4") || audioType.equals("vlc")) {
            mediaAdapter = new MediaAdapter(audioType); // adapter doet de vertaling
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
