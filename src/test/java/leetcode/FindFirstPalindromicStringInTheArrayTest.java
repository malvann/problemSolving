package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstPalindromicStringInTheArrayTest {
    @ParameterizedTest
    @MethodSource
    void test(String[] words, String result) {
        assertEquals(result, new FindFirstPalindromicStringInTheArray().firstPalindrome(words));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new String[]{"abc","car","ada","racecar","cool"}, "ada"),
                Arguments.of(new String[]{"notapalindrome","racecar"}, "racecar"),
                Arguments.of(new String[]{"def","ghi"}, "")
        );
    }
}