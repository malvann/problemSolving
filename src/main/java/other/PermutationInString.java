package other;

import java.util.ArrayList;
import java.util.List;

public class PermutationInString {
    private static final char REPLACER = '0';

    public boolean checkInclusion(String s1, String s2) {
        if (s1.isEmpty()) return true;
        if (s1.length() > s2.length()) return false;

        for (int init : getInitIndexes(s1.charAt(0), s2)) {
            if (checkInclusion(s1, s2, init)) return true;
        }
        return false;
    }

    private boolean checkInclusion(String s1, String s2, int init) {
        char[] s1Chars = s1.toCharArray();
        if (init < 0) return false;

        int start = init - 1;
        int end = init + 1;
        while (start > 0 || end < s2.length()) {
            if (isIsDone(s1Chars)) break;

            if (start > 0 && processChar(s1Chars, s2.charAt(start))) start--;
            else if (end < s2.length() && processChar(s1Chars, s2.charAt(end))) end++;
            else return false;
        }
        return true;
    }

    private List<Integer> getInitIndexes(char s1Char, String s2) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s1Char) res.add(i);
        }
        return res;
    }

    private boolean processChar(char[] s1Chars, char ch) {
        for (int i = 1; i < s1Chars.length; i++) {
            if (s1Chars[i] != ch) continue;
            s1Chars[i] = REPLACER;
            return true;
        }
        return false;
    }

    private boolean isIsDone(char[] s1Chars) {
        for (int i = 1; i < s1Chars.length; i++) {
            if (s1Chars[i] != REPLACER) {
                return false;
            }
        }
        return true;
    }
}
