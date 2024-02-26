package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringIIITest {
    @ParameterizedTest
    @MethodSource
    void test(String s, String result) {
        assertEquals(result, new ReverseWordsInAStringIII().reverseWords(s));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("Mr Ding", "rM gniD")
        );
    }
}