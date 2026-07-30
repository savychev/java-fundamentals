package opdrachten.mediaplayer;

/**
 * ADAPTER-PATROON: vertaalt het MediaPlayer-contract naar het
 * AdvancedMediaPlayer-contract, zodat de client geen weet heeft
 * van de geavanceerde spelers.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        // kies de juiste geavanceerde speler op basis van het formaat
        if (audioType.equals("vlc"))
            advancedMusicPlayer = new VlcPlayer();
        else if (audioType.equals("mp4"))
            advancedMusicPlayer = new Mp4Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        // vertaalslag: play(...) -> playVlc(...) of playMp4(...)
        if (audioType.equals("vlc"))
            advancedMusicPlayer.playVlc(fileName);
        else if (audioType.equals("mp4"))
            advancedMusicPlayer.playMp4(fileName);
    }
}
