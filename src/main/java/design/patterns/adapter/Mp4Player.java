package design.patterns.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    public void playVlc(String fileName) {

    }

    public void playMp4(String fileName) {
        System.out.println("Play mp4 file. Name: " + fileName);
    }
}
