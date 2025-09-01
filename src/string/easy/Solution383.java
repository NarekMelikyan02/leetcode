package string.easy;

import string.easy.problem.RansomNote383;

import java.util.HashMap;

public class Solution383 implements RansomNote383 {
    /*
    * Put each char from magazine into a map with its count.
    * then iterate through ransomNote and decrease the count of each char in the map.
    * If a char is not found in the map, return false.
    * Finally, check if all counts in the map are non-negative.
    * Complexity: O(n + m) where n is the length of ransomNote and m is the length of magazine.
    * */
    @Override
    public boolean canConstruct(String ransomNote, String magazine) {
        var mapOfChars = new HashMap<Character, Integer>();
        for (char c : magazine.toCharArray()) {
            mapOfChars.put(c, mapOfChars.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!mapOfChars.containsKey(c)) {
                return false;
            }
            mapOfChars.put(c, mapOfChars.get(c) - 1);
        }
        return mapOfChars.entrySet().stream().allMatch(entry -> entry.getValue() >= 0);
    }
}
