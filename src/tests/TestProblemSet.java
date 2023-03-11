/*package tests;

import org.junit.Test;
import ratings.ProblemSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

// TODO: Write testing for all 3 methods of the ratings.ProblemSet class
public class TestProblemSet {

    private final double EPSILON = 0.01;

    @Test
    public void arrayTesting(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(3.0);
        list.add(2.0);
        list.add(4.0);
        assertTrue((ProblemSet.average(list) - 2.5) < EPSILON);
    }
    @Test
    public void arrayTestingLargeValues(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(100000.0);
        list.add(300000.0);
        list.add(200000.0);
        list.add(400000.0);
        assertTrue((ProblemSet.average(list) - 250000.0) < EPSILON);
    }

    @Test
    public void arrayTestingNegative(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(-100.0);
        list.add(-300.0);
        assertTrue((ProblemSet.average(list) - -200.0)< EPSILON);
    }
    @Test
    public void arrayTestingLarge(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(1000.0);
        list.add(2000.0);
        list.add(3000.0);
        list.add(4000.0);
        list.add(5000.0);
        list.add(6000.0);
        list.add(7000.0);
        list.add(8000.0);
        list.add(6000.0);
        list.add(7000.0);
        list.add(8000.0);
        assertTrue((ProblemSet.average(list) - 5181.18) > EPSILON);
    }

    @Test
    public void arrayTestingSingleton(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(-1.0);
        assertTrue((ProblemSet.average(list) - -1.0) < EPSILON);
    }

    @Test
    public void arrayTesting0(){
        ArrayList<Double> list = new ArrayList<>();
        assertTrue((ProblemSet.average(list) - 0.0) < EPSILON);
    }

    @Test
    public void sumOfDigitsTesting3(){
        assertTrue(ratings.ProblemSet.sumOfDigits(0000) == 0000);
        assertTrue(ratings.ProblemSet.sumOfDigits(-120) == 3);
        assertTrue(ratings.ProblemSet.sumOfDigits(-999) == 27);
    }

    @Test
    public void sumOfDigitsTesting4(){
        assertTrue(ratings.ProblemSet.sumOfDigits(1234) == 10);
        assertTrue(ratings.ProblemSet.sumOfDigits(4519) == 19);
        assertTrue(ratings.ProblemSet.sumOfDigits(2345) == 14);
    }

    @Test
    public void sumOfDigitsTesting5(){
        assertTrue(ratings.ProblemSet.sumOfDigits(1234) == 10);
        assertTrue(ratings.ProblemSet.sumOfDigits(2178) == 18);
        assertTrue(ratings.ProblemSet.sumOfDigits(9999) == 36);
    }

    @Test
    public void bestKeyTesting(){
        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("CSE", 1);
        dictionary.put("MTH", 9);
        dictionary.put("MGT", 10);
        dictionary.put("CSE1", -1);
        dictionary.put("MTH1", -9);
        dictionary.put("MGT1", 100);
        assertTrue(ProblemSet.bestKey(dictionary) == "MGT1");
    }
    @Test
    public void bestKeyTesting1(){
        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("cat", -10);
        dictionary.put("dog", -40);
        dictionary.put("fox", 70);
        assertTrue(ProblemSet.bestKey(dictionary) != "cat" );
    }

    @Test
    public void bestKeyTesting7() {
        HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("cat", -10);
        dictionary.put("dog", -40);
        dictionary.put("fox", -70);
        assertTrue(ProblemSet.bestKey(dictionary) == "cat");
    }
        @Test
    public void bestKeyTesting2(){
        HashMap<String, Integer> dictionary = new HashMap<>();
        assertTrue(ProblemSet.bestKey(dictionary) == "");
    }
    @Test
    public void bestKeyTesting3(){
      HashMap<String, Integer> dictionary = new HashMap<>();
        dictionary.put("cat", 5);
        dictionary.put("dog", -4);
        dictionary.put("fox", 5);
        assertTrue(ProblemSet.bestKey(dictionary) == "cat" || ProblemSet.bestKey(dictionary) == "fox");
    }
}
// {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
// {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
// {} returns ""
*/