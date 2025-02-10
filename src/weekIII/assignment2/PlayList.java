package weekIII.assignment2;

import java.util.LinkedList;
import java.util.Scanner;

public class PlayList {
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nPlaylist Manager");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Play Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    playSong();
                    break;
                case 4:
                    displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addSong() {
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter artist name: ");
        String artist = sc.nextLine();
        System.out.print("Enter song duration: ");
        double duration = sc.nextDouble();
        sc.nextLine();
        playlist.add(new Song(title, artist, duration));
        System.out.println("Song added successfully.");
    }

    private static void removeSong() {
        System.out.print("Enter song title to remove: ");
        String title = sc.nextLine();
        for (Song s : playlist) {
            if (s.title.equalsIgnoreCase(title)) {
                playlist.remove(s);
                System.out.println("Song removed successfully.");
                return;
            }
        }
        System.out.println("Song not found.");
    }

    private static void playSong() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Playing: " + playlist.getFirst());
    }

    private static void displayPlaylist() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            System.out.println("Playlist:");
            for (Song song : playlist) {
                System.out.println(song);
            }
        }
    }
}
