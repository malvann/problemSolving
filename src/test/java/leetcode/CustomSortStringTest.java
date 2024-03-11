package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomSortStringTest {
    @ParameterizedTest
    @MethodSource
    void test(String order, String s, String result) {
        assertEquals(result, new CustomSortString().customSortString(order, s));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("kqep", "pekeq", "kqeep"),
                Arguments.of("cba", "abcd", "cbad"),
                Arguments.of("bcafg", "abcd", "bcad")
        );
    }
}