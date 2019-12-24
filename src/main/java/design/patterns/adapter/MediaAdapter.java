package design.patterns.adapter;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer = null;

    public MediaAdapter(String type) {
        if (type.equals("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        } else if (type.equals("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        }
    }

    public void play(String type, String fileName) {
        if (type.equals("vlc")) {
            advanceMediaPlayer.playVlc(fileName);
        } else if (type.equals("mp4")) {
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
