package ratings;

import ratings.datastructures.LinkedListNode;
import ratings.ProblemSet;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Song {


    private String songTitle;
    private String songArtist;
    private String songId;
    private LinkedList<Rating> list;


    public Song(String songTitle, String songArtist, String songId) {
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songId = songId;
        this.list = new LinkedList<>();


    }

    public String getTitle() {
        return songTitle;
    }

    public void setTitle(String songTitle) {

        this.songTitle = songTitle;
    }

    public String getArtist() {

        return songArtist;
    }

    public void setArtist(String songArtist) {

        this.songArtist = songArtist;
    }

    public String getSongID() {

        return songId;
    }

    public void setSongID(String songId) {
        this.songId = songId;
    }


    private Rating value;


    //private LinkedListNode<Rating> next;


    public List<Rating> addRating(Rating ratings) {
        if (didReviewerRateSong(ratings.getReviewerID())) {
            return this.list;
        }
         this.list.add(ratings);
        return null;
    }

    public LinkedListNode<Rating> getRatings() {
        LinkedListNode<Rating> head = null;
        LinkedListNode<Rating> nextnode = null;
        for (Rating nodes : list) {
            LinkedListNode<Rating> newList = new LinkedListNode<Rating>(nodes, null);
            if (head == null) {
                head = newList;
                nextnode = newList;
            } else {
                nextnode.setNext(newList);
                nextnode = newList;
            }
            //return head;
        }
        return head;
    }

     public double averageRating() {
         double totalSize = 0.0;
         int totalValue = 0;
         double avg = 0;
         for (Rating nodes : list) {
             if (nodes.getRating() > 0) {
                 totalSize++;
                 totalValue += nodes.getRating();
             }
             avg = totalValue / totalSize;
         }
         return avg;
     }

     public boolean didReviewerRateSong (String review) {
         for (Rating nodes : list) {
             if (nodes.getReviewerID().equals(review)) {
                 return true;
             } else {
                 //return false;
             }
         }
         return false;
     }

     public void removeRatingByReviewer (Reviewer name) {
        String name_remove = name.getreviewerid();
        LinkedListNode<Rating> node = this.getRatings();
        while(true){
            String current_name = node.getNext().getValue().getReviewerID();
            if(current_name == name_remove){
                node.setNext(node.getNext().getNext());
                break;
            }
            node = node.getNext();
        }

     }
}







