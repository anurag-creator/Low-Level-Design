package LowLevelDesign.Structural.Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("MP3", "song.mp3");
        audioPlayer.play("MP4", "video.mp4");
        audioPlayer.play("VLC", "movie.vlc");
        audioPlayer.play("AVI", "unsupported.avi");
    }
}
