package Clase;

import java.util.ArrayList;

public class Radio {
    boolean on;
    int volume;
    int currentPostIndex;
    static ArrayList<String> post;







    public Radio() {
        volume = 0;
        currentPostIndex = 1;
        post= new ArrayList<>();
        post.add("Radio Noroc");
        post.add("Radio Konichiua");
        post.add("Radio Salut");
        post.add("Radio Privet");
        post.add("Radio Zdarova");
    }

    public static void main(String[] args) {
        Radio radio1=new Radio();
//	ArrayList<Radio>posturi=new ArrayList<>();
//	posturi.add(radio1);
//	posturi.add(radio1);
//	posturi.add(radio1);
//	posturi.add(radio1);
//	posturi.add(radio1);

        radio1.turnOff();
        radio1.turnOff();
        radio1.TurnVolumeUp();
        radio1.TurnVolumeUp();

        radio1.changePostForward();

        radio1.changePostBackward();


        radio1.turnOn();
        radio1.displayRadioStatus();
        radio1.changePostForward();
        radio1.TurnVolumeDown();
        radio1.displayRadioStatus();
    }
    public void turnOn() {
        if(on) {
            System.out.println("Radioul este deja pornit");

        }else {
            System.out.println("Radioul s-a pornit");
            on=true;
        }
    }
    public void turnOff() {
        if(on) {
            System.out.println("Radioul s-a oprit");
            on=false;
        }else {
            System.out.println("Radioul este deja oprit");

        }
    }
    public void TurnVolumeUp() {
        if(volume==10) {
            System.out.println("Volumul este la maxim");
        }else {
            volume++;
            System.out.println("volumul este:" +volume);

        }
    }
    public void TurnVolumeDown() {
        if(volume==0) {
            System.out.println("Volumul este la minim");
        }else {
            volume--;
            System.out.println("volumul este:" +volume);

        }
    }
    public void changePostForward() {
        if(currentPostIndex==post.size()-1) {
            currentPostIndex=0;
        }else {
            currentPostIndex++;
            displayRadioStatus();//afiseaza de fiecare data statusul radioului cand schimb una dintre valori
        }
    }
    public void changePostBackward() {
        if(currentPostIndex==0) {
            currentPostIndex=post.size()-1;
        }else {
            currentPostIndex--;
            displayRadioStatus();
        }
    }
    public void displayRadioStatus() {
        if(!on) {
            System.out.println("Radioul este oprit");
        }else {
            System.out.println("Radioul este pe postul: "+post.get(currentPostIndex)+ ",dat la volumul: "+volume );
        }
    }
}