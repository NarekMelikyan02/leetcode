package interviewprep;

import java.util.HashMap;

/*
 * Problem is to return two numbers indexes from array that sum up to given target
 * */
public class TwoSum {

    /*
    Solution is to create map that will hold number from nums as key and its index as value
    iterate trough nums if there is key in map which equals target - nums[i] then we found answer
    else add nums[i] and i to map
    */
    public static int[] solution(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var answer = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(target - nums[index])) {
                return new int[]{index, map.get(target - nums[index])};
            }
            map.put(nums[index], index);
        }
        return answer;
    }
}
