package ratings.datastructures;

import ratings.Song;

public class SongBayesianRatingComparator extends Comparator<Song> {

    @Override
    public boolean compare(Song a, Song b) {
        double bayesianrating1 = a.bayesianAverageRating(2,3);
        double bayesianrating2 = b.bayesianAverageRating(2,3);
        System.out.println(bayesianrating1);
        System.out.println(bayesianrating2);
        System.out.println(bayesianrating1 > bayesianrating2);
        return bayesianrating1 >= bayesianrating2;

       /* if (bayesianrating1 == bayesianrating2) {
            return false;
        } else if (bayesianrating1 < bayesianrating2){
            return false;
        } else {
            return true;
        }*/
        //return bayesianrating1 > bayesianrating2;
        //return false;
        //return true;
    }




}
