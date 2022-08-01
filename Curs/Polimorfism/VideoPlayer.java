package Polimorfism;

import java.util.ArrayList;
import java.util.Arrays;

public class VideoPlayer {
    public void PlayVideo(String movieName){
        System.out.println("Player-ul a pornit video-ul"+movieName);
    }

    public static void main(String[] args) {
        ArrayList<String>movies=new ArrayList<>(Arrays.asList("aaaaa","bbbbb","cccc"));
        VlcPlayer vlc=new VlcPlayer();
        WindowsMediaPlayer windowsMediaPlayer=new WindowsMediaPlayer();
        Winmap winmap=new Winmap();
       /* vlc.PlayVideo("Astral");
        windowsMediaPlayer.PlayVideo("AAAA");
        winmap.PlayVideo("SSSS");*/
        for (int i = movies.size()-1 ;i >=0 ; i--) //pentru a le afisa descrescator{
            vlc.PlayVideo(movies.get(i));
            //windowsMediaPlayer.PlayVideo(movies.get(i));
           // winmap.PlayVideo(movies.get(i));
        }
    }


