import java.util.ArrayList;

public class Song {
    private String songTitle;
    private String songMusician;
    private String songGenre;

    public Song(String songTitle, String songMusician, String songGenre){
        this.songTitle = songTitle;
        this.songMusician = songMusician;
        this.songGenre = songGenre;
    }

    public void displayDetails(){
        System.out.println("Title: " + this.songTitle);
        System.out.println("Genre: " + this.songGenre);
        System.out.println("By: " + this.songMusician);
        System.out.println("**********************************");
    }

    public String displayTitle(){
        return this.songTitle;
    }

    public String displayGenre(){
        return this.songGenre;
    }

    public String displayMusician(){
        return this.songMusician;
    }

}
