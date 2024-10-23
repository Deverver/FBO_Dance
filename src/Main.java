import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //region Creates and shuffles ArrayList of Song objects
        ArrayList<Song> todaysPlaylist = new ArrayList<>();

        todaysPlaylist.add(new Song("It's Just Begun", "Jimmy Castor Bunch", "Breakdance"));
        todaysPlaylist.add(new Song("Apache", "Incredible Bongo Band", "Breakdance"));
        todaysPlaylist.add(new Song("Planet Rock", "Afrika Bambaataa & The Soulsonic Force", "Breakdance"));
        todaysPlaylist.add(new Song("Jam On It", "Newcleus", "Breakdance"));
        todaysPlaylist.add(new Song("Rockit", "Herbie Hancock", "Breakdance"));
        todaysPlaylist.add(new Song("Electric Boogie", "Marcia Griffiths", "Boogie"));
        todaysPlaylist.add(new Song("Boogie Wonderland", "Earth, Wind & Fire", "Boogie"));
        todaysPlaylist.add(new Song("More Bounce to the Ounce", "Zapp", "Boogie"));
        todaysPlaylist.add(new Song("Electric Kingdom", "Twilight 22", "Boogie"));
        todaysPlaylist.add(new Song("Let It Whip", "Dazz Band", "Boogie"));

        Collections.shuffle(todaysPlaylist);
        //endregion

        //region Creates and shuffles Arraylist of Dancers
        ArrayList<Dancer> partyGoers = new ArrayList<Dancer>();
        partyGoers.add(new Breakdancer("Tina", 28, "Breakdance"));
        partyGoers.add(new Breakdancer("Vince", 22, "Breakdance"));
        partyGoers.add(new Breakdancer("Donna", 28, "Breakdance"));
        partyGoers.add(new Breakdancer("Rick", 33, "Breakdance"));
        partyGoers.add(new Breakdancer("Carmen", 36, "Breakdance"));
        partyGoers.add(new ElectricBoogieDancer("Tony", 25, "Boogie"));
        partyGoers.add(new ElectricBoogieDancer("Lisa", 27, "Boogie"));
        partyGoers.add(new ElectricBoogieDancer("Bobby", 24, "Boogie"));
        partyGoers.add(new ElectricBoogieDancer("Crystal", 32, "Boogie"));
        partyGoers.add(new ElectricBoogieDancer("Johnny", 28, "Boogie"));

        Collections.shuffle(partyGoers);
        //endregion

        playSongs(todaysPlaylist,partyGoers);



    }// Class main end


    public static void playSongs(ArrayList<Song> songList, ArrayList<Dancer> partyGoers) {
        for (Song song : songList) {
            System.out.println("Song: " + song.displayTitle() + " is currently playing!");
            whoWantsToDance(song.displayGenre(), partyGoers);
            for (Dancer dancer : partyGoers){
                if (dancer.isDancing){
                    dancer.dance();
                }
            }
        }
    }

    public static void whoWantsToDance(String songGenre, ArrayList<Dancer> partyGoers) {
        for (Dancer dancer : partyGoers) {
            if (songGenre.equals(dancer.getDanceStyle())) {
                dancer.setDancing(true);
            } else {
                dancer.setDancing(false);
            }
        }
    }


}// Main end