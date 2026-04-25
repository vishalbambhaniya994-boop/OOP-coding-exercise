import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {

        
        LinkedList<String> playlist = new LinkedList<>();

        
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");

        System.out.println("Playlist after adding songs:");
        System.out.println(playlist);

        
        System.out.println("\nFull Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

    
        if (!playlist.isEmpty()) {
            String playedSong = playlist.removeFirst();
            System.out.println("\nPlaying: " + playedSong);
        }

        System.out.println("Playlist after playing first song:");
        System.out.println(playlist);

        
        if (!playlist.isEmpty()) {
            String skippedSong = playlist.removeLast();
            System.out.println("\nSkipped: " + skippedSong);
        }

        System.out.println("Playlist after skipping last song:");
        System.out.println(playlist);
    }
}
