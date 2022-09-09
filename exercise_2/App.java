import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

        LinkedList<String> Song = new LinkedList<>();
    
        //Add 5 new songs to your Playlist using the add() method
        Song.add("Pink Venom");
        Song.add("As if its your last");
        Song.add("Playing with fire");
        Song.add("Whistle");
        Song.add("Kill this love");
       
        //Add a new song at the front of the Playlist using the addFirst() method
        Song.addFirst("Boombayah");

        //Add a new song at the end of the Playlist using the addLast() method
        Song.addLast("How you like that");

        //Display the song at the front of the Playlist using the combination of get() method and the println() method
        System.out.println(Song.get(0));

        //Replace the last song using the set() method
        Song.set(6, "Stay");

        //Remove the first song using the remove() method
        Song.remove(0);

        //Display all songs in your Playlist using the println method
        System.out.println("Jonnah's Playlist: " + Song);
    }
}
