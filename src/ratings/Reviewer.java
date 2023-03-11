package ratings;


public class Reviewer {
    private String reviewid;

    //private int setRating;


    public Reviewer(String reviewid) {
        this.reviewid = reviewid;
    }

    public String getreviewerid() {
        return reviewid;
    }

    public void setReviewerID(String reviewId) {
        this.reviewid = reviewId;
    }

    public Rating rateSong(int id) {
        return new Rating(this.getreviewerid(), id);
    }



}

