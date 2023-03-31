package ratings.datastructures;

import ratings.Song;

import java.util.LinkedList;

public class SongTitleComparator extends Comparator<Song> {

    //private LinkedList<Song>

    public SongTitleComparator(){

    }

    @Override
    public  boolean compare(Song a, Song b) {
        String song1 = a.getTitle();
        String song2 = b.getTitle();
        return song1.compareToIgnoreCase(song2) < 0;
    }

}

