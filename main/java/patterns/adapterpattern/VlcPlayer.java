package patterns.adapterpattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        // do nothing
    }
}
