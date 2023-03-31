package ratings;

import ratings.datastructures.LinkedListNode;

import java.util.LinkedList;

public class Ratable {

    private String title;
    private LinkedList<Rating> list;
    private LinkedListNode<Rating> ratings;


    public Ratable (String songTitle){
        this.title = songTitle;
        list = new LinkedList<>();
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String songTitle) {
        this.title = title;
    }

    public void addRating(Rating rating) {
        if (didReviewerRateSong(rating.getReviewerID())) {
            return;
        }
        this.list.add(rating);
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
            if (nodes.getRating() >= -1) {
                totalSize++;
                totalValue += nodes.getRating();
                System.out.println(nodes.getRating());
            }
            avg = totalValue / totalSize;
        }
        System.out.println(avg);
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
        for(Rating node : list){
            if(node.getReviewerID() == name.getReviewerID()){
                list.remove(node);
            }
        }//end for
    }

    public double bayesianAverageRating (int howMany, int ratingVal) {
        double totalVal = 0;
        double bayesianAverage = 0.0;
        double addedVal = (howMany * ratingVal);
        if (list.size() == 0 && addedVal == 0) {
            return bayesianAverage;
        } else {
            for (Rating ratings : list) {
                totalVal += ratings.getRating();
            }
            double total = totalVal + addedVal;
            int totalNumRatings = list.size() + howMany;
            bayesianAverage = ((total / totalNumRatings));
        }
        return bayesianAverage;
    }


}
