package tests;

import ratings.Rating;
import ratings.Movie;
import ratings.Song;

import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;

import ratings.datastructures.Comparator;
import ratings.datastructures.LinkedListNode;
import ratings.datastructures.SongBayesianRatingComparator;
import ratings.datastructures.SongTitleComparator;

import static org.junit.Assert.*;

public class TestClasses2 {

    private final double EPSILON = 0.001;

    public void compareDoubles(double d1, double d2) {
        assertTrue(d1 + " and " + d2 + " are not within " + EPSILON, Math.abs(d1 - d2) < EPSILON);

    }

  /*  public void compareArrayListStrings (ArrayList<String> expected, ArrayList<String> actual) {
        for (int x=0; x<expected.size(); x++) {
            for (int x=0; x<actual.size(); x++) {
            assertEquals(expected, actual);
            }
        }

    }*/
        @Test
        public void bayesianAverageRatingTesting () {
            Song song = new Song("Enter Sandman", "Metallica", "CD-E-LDc384");
            //No addedRatings
            compareDoubles(song.bayesianAverageRating(0, 0), 0.0);
            compareDoubles(song.bayesianAverageRating(1, 2), 2.0);
            compareDoubles(song.bayesianAverageRating(2, 3), 3.0);

            //Three added ratings
            song.addRating(new Rating("alex", 3));
            song.addRating(new Rating("nick", 4));
            song.addRating(new Rating("nathan", 5));

            compareDoubles(song.bayesianAverageRating(0,0), 4.0);
            compareDoubles(song.bayesianAverageRating(2,3), 3.6);
            compareDoubles(song.bayesianAverageRating(4,3), 3.428571);

            ArrayList<String> actors = new ArrayList<>();
            String title = "The Internship";
            Movie movie = new Movie (title, actors);

            compareDoubles(movie.bayesianAverageRating(0, 0), 0.0);
            compareDoubles(movie.bayesianAverageRating(0, 0), 0.0);
            compareDoubles(movie.bayesianAverageRating(1, 2), 2.0);

            movie.addRating(new Rating("alex", 3));
            movie.addRating(new Rating("nick", 4));
            movie.addRating(new Rating("nathan", 5));

            compareDoubles(movie.bayesianAverageRating(0,0), 4.0);
            compareDoubles(movie.bayesianAverageRating(2,3), 3.6);
            compareDoubles(movie.bayesianAverageRating(4,3), 3.428571);
        }

    @Test
    public void TestgetTitle() {
        ArrayList<String> actual = new ArrayList<>();

        Movie movie = new Movie("The Internship", actual);
        String title1 = movie.getTitle();
        assertEquals(movie.getTitle(), title1);

        ArrayList<String> actual1 = new ArrayList<>();
        Movie movie2 = new Movie("This is the End", actual1);
        String title2 = movie2.getTitle();
        assertTrue(!title1.equals(movie2.getTitle()));
    }

    @Test
    public void TestgetCast() {
        //Song song = new Song("Enter Sandman", "Metallica", "CD-E-LDc384");
        ArrayList<String> actual = new ArrayList<>();
        actual.add("Chris Pratt");
        actual.add("Zoe Saldana");
        actual.add("Dave Bautista");

        ArrayList<String> actorsListExpected = new ArrayList<>(Arrays.asList("Chris Pratt", "Zoe Saldana", "Dave Bautista"));

        Movie movie = new Movie("Guardian of the Galaxy", actual);
        assertEquals(actorsListExpected, actual);
        assertTrue(actorsListExpected.containsAll(actual) && actual.containsAll(actorsListExpected));

        ArrayList<String> actors = new ArrayList<>();
        actors.add("Paul Biz");
        actors.add("Ryan Whitney");
        actors.add("Rear Admiral");

        ArrayList<String> actorsListExpected1 = new ArrayList<>(Arrays.asList("Rear Admiral", "Ryan Whitney", "Paul Biz"));
        Movie movie1 = new Movie("Spittin Chiclets", actors);

        assertTrue(actorsListExpected1.containsAll(actors) && actors.containsAll(actorsListExpected1));


    }

    /*public String arrayItems(ArrayList<String> arr) {
            for (String actor : arr) {
                return actor;
            }
        return null;
    }*/

    public void compareRatings(Rating computed, Rating expected) {
        assertTrue(computed.getRating() == expected.getRating());
        assertTrue(computed.getReviewerID().equals(expected.getReviewerID()));
    }

    public void checkRatingsList(LinkedListNode<Rating> computed, LinkedListNode<Rating> expected) {
        if (expected == null) {
            assertTrue(computed == null);
        } else {
            assertTrue(computed != null);
            compareRatings(computed.getValue(), expected.getValue());
            checkRatingsList(computed.getNext(), expected.getNext());
        }
    }

    public void addAllRatings(Movie movie, LinkedListNode<Rating> ratings) {
        if (ratings != null) {
            movie.addRating(ratings.getValue());
            addAllRatings(movie, ratings.getNext());
        }
    }

    @Test
    public void TestMovieAddRating(){
        LinkedListNode<Rating> expected = new LinkedListNode<>(new Rating("Jesse", 4), null);
        expected = new LinkedListNode<>(new Rating("Paul", 5), expected);
        expected = new LinkedListNode<>(new Rating("Carl", 3), expected);

        ArrayList<String> cast = new ArrayList<>();
        Movie movie = new Movie("This is the End", cast);
        addAllRatings(movie, expected);
        addAllRatings(movie, expected);
        addAllRatings(movie, expected);

        LinkedListNode<Rating> computed = movie.getRatings();
        checkRatingsList(computed, expected);

    }

    @Test
    public void testSongTitle () {
        Song song = new Song("Enter Sandman", "Metallica", "CD-E-LDc384");
        Song song2 = new Song("Dynamite", "BTS", "o-YBDTqX_ZU");
        Comparator<Song> comparator = new SongTitleComparator();

        assertTrue(comparator.compare(song2, song));
        assertTrue(!comparator.compare(song, song2));

        Song song3 = new Song("SULTANS OF SWING", "Dire Straits","" );
        Song song4 = new Song("walk of life", "Dire Straits", "");

        assertTrue(comparator.compare(song3, song4));
        assertTrue(!comparator.compare(song4, song3));
    }

    @Test
    public void testBayesianCompare () {
        Song song = new Song("Enter Sandman", "Metallica", "CD-E-LDc384");
        song.addRating(new Rating("alex", 3));
        song.addRating(new Rating("al", 2));


        Song song2 = new Song("Dynamite", "BTS", "o-YBDTqX_ZU");
        song2.addRating(new Rating("albert", 3));
        song2.addRating(new Rating("bert", 4));

        Comparator<Song> comparator = new SongBayesianRatingComparator();

        assertTrue(comparator.compare(song2,song));
        //assertTrue(!comparator.compare(song,song2));

        Song song3 = new Song("walk of life", "Dire Straits", "");
        Song song4 = new Song("SULTANS OF SWING", "Dire Straits","" );
        Comparator<Song> comparator1 = new SongBayesianRatingComparator();

        assertTrue(comparator.compare(song4,song3) == false);
    }


}




