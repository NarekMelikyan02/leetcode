package string.easy;

import string.easy.problem.IsomorphicStrings205;

import java.util.HashMap;

public class Solution205 implements IsomorphicStrings205 {
    @Override
    public boolean isIsomorphic(String s, String t) {
        var rules = new HashMap<Character, Character>();
        var first = s.toCharArray();
        var second = t.toCharArray();
        if (first.length != second.length) return false;

        for (int i = 0; i < first.length; i++) {
            if (rules.containsKey(first[i])) {
                if (!rules.get(first[i]).equals(second[i])) {
                    return false;
                }
            } else {
                if(rules.containsValue(second[i])) {
                    return false;
                }
                rules.put(first[i], second[i]);
            }
        }
        return true;
    }
}
