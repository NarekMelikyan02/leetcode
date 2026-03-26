package interviewprep;

/*
 * Problem
 * Given array of [0,n] which consists of distinct numbers between 0 and n find number that is missing from array
 * */
public class MissingNumber {
    public static int missingNumber(int[] nums) {
    /*
    * Solution
    * init answer to nums length then iterate trough array and accumulate differences between index and number that index holds
    * */
        var answer = nums.length;
        for (int i = 0; i < nums.length; i++) {
            answer += i - nums[i];
        }
        return answer;
    }
}
