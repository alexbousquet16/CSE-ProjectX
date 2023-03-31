package ratings;

import ratings.datastructures.LinkedListNode;

import java.util.ArrayList;
import java.util.LinkedList;


public class Movie extends Ratable {

    //private String movieTitle;
    private ArrayList<String> actors;
    private LinkedList<Rating> list;

    public Movie(String title, ArrayList<String> actors) {
        super(title);
        this.actors = actors;
        this.list = new LinkedList<>();
    }

    public void setCast(ArrayList<String> actors) {
        this.actors = actors;
    }

    public ArrayList<String> getCast() {
        return actors;
    }
}
