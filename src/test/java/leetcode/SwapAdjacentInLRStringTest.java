package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapAdjacentInLRStringTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String from, String to, boolean result) {
        assertEquals(result, new SwapAdjacentInLRString().canTransform(from, to));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("XXXXXLXXXX", "LXXXXXXXXX", true),
                Arguments.of("LXXLXRLXXL", "XLLXRXLXLX", false),
                Arguments.of("RXXLRXRXL", "XRLXXRRLX", true),
                Arguments.of("X", "L", false),
                Arguments.of("XLXRRXXRXX", "LXXXXXXRRR", true),
                Arguments.of("RXR", "XXR", false)
        );
    }
}

