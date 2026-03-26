package interviewprep;

import java.util.HashMap;

/*
 * Problem is to check if two strings contain exactly same symbols in any order, occurring equally in both
 * */
public class ValidAnagram {

    /*
     * Solution is to implement map that will hold as key chars from first string and as value their accurance
     * then iterate trough second string getting and decrementing count in map if map contains values other than 0 then
     * strings are not anagram
     * */
    public static boolean isAnagram(String s, String t) {
        var map = new HashMap<Character, Integer>();
        for (char sch : s.toCharArray()) {
            map.put(sch, map.getOrDefault(sch, 0) + 1);
        }
        for (char tch : t.toCharArray()) {
            map.put(tch, map.getOrDefault(tch, 0) - 1);
        }
        return map.values().stream().allMatch(v -> v == 0);
    }
}
