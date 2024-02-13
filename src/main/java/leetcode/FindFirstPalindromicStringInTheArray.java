package leetcode;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFirstPalindromicStringInTheArray {
    public String firstPalindrome(String[] words) {
        return Stream.of(words).sequential()
                .filter(this::isPalindrome)
                .findFirst()
                .orElse("");
    }

    private boolean isPalindrome(String s) {
        return IntStream.range(0, s.length())
                .noneMatch(i -> s.charAt(i) != s.charAt(s.length() - 1 - i));
    }
}
