package weekIII.assignment2;

public class Song {

        String title;
        String artist;
        double duration; // Duration in minutes

        Song(String title, String artist, double duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Title: " + title + ", Artist: " + artist + ", Duration: " + duration ;
        }
    }

