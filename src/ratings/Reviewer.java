package ratings;


public class Reviewer {
    private String reviewId;

    //private int setRating;


    public Reviewer(String reviewId) {
        this.reviewId = reviewId;
    }


    public String getReviewerID() {
        return reviewId;
    }

    public void setReviewerID(String reviewId) {
        this.reviewId = reviewId;
    }

    public Rating rateSong(int id) {
        return new Rating(this.getReviewerID(), id);
    }

}

