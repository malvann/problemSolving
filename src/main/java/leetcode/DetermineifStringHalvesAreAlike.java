package leetcode;

import java.util.List;

public class DetermineifStringHalvesAreAlike {
    private static final List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public boolean halvesAreAlike(String s) {
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (vowels.contains(s.charAt(i))) aCount++;
            if (vowels.contains(s.charAt(i + s.length() / 2))) bCount++;
        }
        return aCount == bCount;
    }
}
