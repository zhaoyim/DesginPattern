package design.patterns.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Play vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {

    }
}
