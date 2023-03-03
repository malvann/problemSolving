package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;

        int[] ints = s.chars().toArray();
        int maxLength = 0;
        int currentLength = 1;
        int start = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (hasDuplicates(Arrays.copyOfRange(ints, start, i + 1), ints[i + 1])) {
                currentLength++;
                i++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
                start++;
                i = start;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    private boolean hasDuplicates(int[] copyOf, int anInt) {
        return IntStream.of(copyOf).allMatch(ints -> ints != anInt);
    }
}
