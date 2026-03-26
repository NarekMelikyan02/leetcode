package interviewprep;

import java.util.HashMap;

/*
 * Find element in array that appears more than others assuming array consists of n elements more is n/2
 * */
public class MajorityElement {
    /*
    * Solution
    * Construct map that contains each number and its occurance and check if occurance is higher than n/2
    * if is return number else continue
    * */
    public static int majorityElement(int[] nums) {
        var appearances = new HashMap<Integer, Integer>();
        for (int num : nums) {
            appearances.put(num, appearances.getOrDefault(num, 0) + 1);
            var count = appearances.get(num);
            if (count > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }
}
