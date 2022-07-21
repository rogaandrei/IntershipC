package Clase;

import java.util.ArrayList;


public class FacebookUser {
    String firtsname;
    String lastname;
    int birthyear;
    ArrayList<String> posts;


    public FacebookUser(String firtsname, String lastname, int birthyear) {
        super();
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.birthyear = birthyear;
        posts=new ArrayList<>();
//		posts.add("Dragoste");
////		posts.add("Bani");
////		posts.add("Masini");
////		posts.add("Distractie");
////		posts.add("Bautura si Manele :)");
    }
    public static void main(String[] args) {
        FacebookUser user1=new FacebookUser("Ion","Balea",2000);
        user1.WritePost("ninge");
        user1.PrintAllPost();//posteaza ceea ce a printat utilizatorul
    }
    public void WritePost(String content){
        posts.add(content);
    }
    public void PrintAllPost() {
        for(int i=0;i<posts.size();i++) {
            System.out.println(posts.get(i));//pentru a afisa fiecare postare
        }

    }
}
