package Polimorfism;

public class WindowsMediaPlayer extends VideoPlayer{
    @Override
    public void PlayVideo(String movieName) {
        System.out.println("WindowsMediaPlayer a pornit "+ movieName+ " la calitate medie  " );
    }
}
