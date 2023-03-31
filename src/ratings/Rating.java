package ratings;

public class Rating {

    private String reviewId;
    private int ratingValue;

    public Rating(String reviewId, int ratingValue){
        this.reviewId = (reviewId);
        this.ratingValue= (ratingValue);
    }

    public String getReviewerID(){
        return this.reviewId;
    }

    public void setReviewerID(String ratingId){
        this.reviewId = ratingId;
    }

    public int getRating()  {
        return this.ratingValue;
    }

    public void setRating(int value) {
        if (value >= 0 && value  <= 5) {
            this.ratingValue = value;
        } else {
            this.ratingValue = -1;
        }
    }





}

