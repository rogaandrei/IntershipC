package Interfete.Ex3.Ex1;

public class Radio implements Startable,Stopable,Changeble{
    String currentPost;

    public Radio ( String currentPost ) {
        this.currentPost = currentPost;
    }

    @Override
    public void changeCurrentPost ( String newPost ) {
        System.out.println( "Am schimbat postul:"+newPost);
        currentPost=newPost;
    }

    @Override
    public void start () {
        System.out.println("Am pornit radioul");
    }

    @Override
    public void staop () {
        System.out.println("Am oprit radioul");
    }

    @Override
    public String toString () {
        return "Radio{" +
                "currentPost='" + currentPost + '\'' +
                '}';
    }
}
