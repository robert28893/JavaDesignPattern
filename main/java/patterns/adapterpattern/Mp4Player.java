package patterns.adapterpattern;

/**
 * Created by Hoang Phuong on 10/30/2016.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {
        // do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
