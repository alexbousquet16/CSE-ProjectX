package ratings;

public class Rating {

    private String reviewId;
    private int ratingValue;

    public Rating(String reviewId, int ratingValue){
        this.reviewId = (reviewId);
        this.ratingValue =(ratingValue);
    }

    public String getReviewerID(){
        return reviewId;
    }

    public void setReviewerID(String ratingId){
        this.reviewId = ratingId;
    }

    public int getRating()  {
        return ratingValue;
    }

    public void setRating(int value) {
        if (value < 1 || value  > 5) {
            this.ratingValue = -1;
        } else {
            this.ratingValue = value;
        }
    }





}

