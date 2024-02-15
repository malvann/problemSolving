package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpingOnTheCloudsTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> c, int result) {
        assertEquals(result, JumpingOnTheClouds.jumpingOnClouds(c));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0), 46),
                Arguments.of(List.of(0, 0), 1),
                Arguments.of(List.of(0, 0, 1, 0, 0, 1, 0), 4),
                Arguments.of(List.of(0, 0, 0, 0, 1, 0), 3)
        );
    }
}