package string.easy;

import string.easy.problem.ExcelSheetColumnNumber171;

import java.util.HashMap;

public class Solution171 implements ExcelSheetColumnNumber171 {
    @Override
    public int titleToNumber(String columnTitle) {
        int result = 0;
        var rules = new HashMap<Character, Integer>();
        for (int i = 1; i <= 26; i++) {
            rules.put((char) ('A' + i - 1), i);
        }
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            char c = columnTitle.charAt(i);
            result += (int) (rules.get(c) * Math.pow(26, columnTitle.length() - 1 - i));
        }
        return result;
    }
}
