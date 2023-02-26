package leetcode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsInAString {
    public String reverseWords(String s) {
        return Stream.of(s.split(" ")).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
}
