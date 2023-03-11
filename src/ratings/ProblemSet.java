package ratings;

import java.util.HashMap;
import java.util.*;


import static org.junit.Assert.assertTrue;

public class ProblemSet {


    private static String entry;

    public static double average(ArrayList<Double> numbers) {
        double append = 0.0;
        double avg = 0.0;
        if (numbers.size() == 0.0) {
            System.out.println(0.0);
            return 0.0;
        } else {
            for (int keys = 0; keys < numbers.size(); keys++) {
                append += numbers.get(keys);
                double total = numbers.size();
                avg = append / total;
            }
        }
        System.out.println(avg);
        return avg;
        // TODO: Implement this method to return the average of all the numbers in the input ArrayList
        //       If the ArrayList is empty, return 0.0
        //
        // Examples
        // [1.0,2.0,3.0] returns 2.0
        // [-5.0,5.0] returns 0.0
        // [6.5,6.5,8.5,8.5] returns 7.5
        // [] returns 0.0
    }

    public static double sumOfDigits(int nums) {
        int append = 0;
        int remainder = 0;
        while (nums < 0 || nums > 0) {
            remainder = nums % 10;
            append = append + remainder;
            nums = nums / 10;
        }
        System.out.println(Math.abs(append));
        return (Math.abs(append));





        // TODO: Write a public static method named sumOfDigits that takes an int as a parameter and
        //       returns the sum of the digits of the input as an int
        //
        // Examples
        // 123 returns 6
        // 57 returns 12
        // -36 returns 9
    }

    public static String bestKey(HashMap<String, Integer> list) {
        if (list.size() == 0) {
            return "";
        } else {
            int highestVal = (Collections.max(list.values()));
            for (HashMap.Entry<String, Integer> entries : list.entrySet()) {
                if (entries.getValue() == highestVal) {
                    System.out.println(entries.getKey());
                    return entries.getKey();
                    }
                }
            }
            return null;

        }

        // TODO: Write a public static method named bestKey that takes a HashMap of String to Integer
        //       as a parameter and returns a key mapping to the largest Integer. Ties can be broken arbitrarily.
        //       If the HashMap is empty, return the empty String
        //
        // Examples
        // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
        // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
        // {} returns ""


    }
        // TODO: Write a public static method named bestKey that takes a HashMap of String to Integer
        //       as a parameter and returns a key mapping to the largest Integer. Ties can be broken arbitrarily.
        //       If the HashMap is empty, return the empty String
        //
        // Examples
        // {"CSE": 100, "MTH": 90, "MGT": 10} returns "CSE"
        // {"cat": 5, "dog": 5, "fox": 4} can return either "cat" or "dog"
        // {} returns ""




