package ratings;

import ratings.datastructures.Comparator;
import ratings.datastructures.LinkedListNode;

import java.util.LinkedList;

public class Playlist {

    private Comparator<Song> comparator;


    private LinkedListNode<Song> songList;
    private Song song;

    public Playlist(Comparator<Song> comparator, Song song){
        this.comparator = comparator;
        this.song = song;
        this.songList = new LinkedListNode<>(song, null);

    }

    public void addSong(Song songs) {
        this.songList.append(songs);
    }

    public LinkedListNode<Song> getSongList() {
        return this.songList;
    }

    public String SongBayesianRatingComparator(){
        return null;
    }

    /*public double SongTitleComparator(){

    }
*/

}
