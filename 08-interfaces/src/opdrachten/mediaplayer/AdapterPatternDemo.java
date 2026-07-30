package opdrachten.mediaplayer;

/** Demo van het adapter-patroon: één play-methode voor alle formaten. */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3"); // rechtstreeks
        audioPlayer.play("mp4", "alone.mp4");              // via adapter
        audioPlayer.play("vlc", "far far away.vlc");       // via adapter
        audioPlayer.play("avi", "mind me.avi");            // niet ondersteund
    }
}
