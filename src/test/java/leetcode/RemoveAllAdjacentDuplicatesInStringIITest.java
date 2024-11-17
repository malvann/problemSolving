package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveAllAdjacentDuplicatesInStringIITest {
    @ParameterizedTest
    @MethodSource()
    void test(String s, int n, String result) {
        assertEquals(result, new RemoveAllAdjacentDuplicatesInStringII().removeDuplicates(s, n));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abcd", 2, "abcd"),
                Arguments.of("deeedbbcccbdaa", 3, "aa"),
                Arguments.of("pbbcggttciiippooaais", 2, "ps")
        );
    }
}