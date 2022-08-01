package Polimorfism;

public class VlcPlayer extends VideoPlayer{
    @Override
    public void PlayVideo(String movieName) {
        System.out.println("VLCPlayer a pornit "+ movieName+ " la calitate buna  " );
    }
}
