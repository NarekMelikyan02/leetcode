package string.easy;

import string.easy.problem.ValidAnagram242;

import java.util.HashMap;

public class Solution242 implements ValidAnagram242 {
    /*
     * Solution: Use a hash map to count the occurrences of each character in string s.
     * Then, get counts by decrementing the counts for each character in string t.
     * Finally, check if all counts are zero.
     * */

    //Complexity O(n)
    @Override
    public boolean isAnagram(String s, String t) {
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();
        var countMap = new HashMap<Character, Integer>();
        for (char c : sArr) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : tArr) {
            countMap.put(c, countMap.getOrDefault(c, 0) - 1);
        }
        return countMap.entrySet().stream()
                .allMatch(entry -> entry.getValue() == 0);
    }
}
