package design.patterns.adapter;

public class AudioPlayer implements MediaPlayer {


    public void play(String type, String fileName) {
        if (type.equals("mp3")) {
            System.out.println("Play mp3 file. Name: " + fileName);
        } else if (type.equals("mp4") || type.equals("vlc")) {
            new MediaAdapter(type).play(type, fileName);
        } else {
            System.out.println("Invalid type: " + type + " format not supported");
        }
    }
}
