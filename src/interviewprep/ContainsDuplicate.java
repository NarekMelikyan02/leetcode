package interviewprep;

import java.util.HashSet;

/*
 * problem is to check if there is any dupe value in given int arr
 * */
public class ContainsDuplicate {

    /*
     * Solution is to create and populate set with all [] items and check if size is equal to [].length
     * */

    public static boolean containsDupe(int[] nums) {
        var set = new HashSet<Integer>(nums.length);
        for (int num : nums) {
            set.add(num);
        }
        return nums.length != set.size();
    }
}
