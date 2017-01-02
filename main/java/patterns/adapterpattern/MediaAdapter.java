package patterns.adapterpattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;
    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
