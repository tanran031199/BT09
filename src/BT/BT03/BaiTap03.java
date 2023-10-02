package BT.BT03;

public class BaiTap03 {
    public static void main(String[] args) {
        Playable audio = new AudioPlayer();
        Playable video = new VideoPlayer();

        audio.play();
        video.play();
    }
}
