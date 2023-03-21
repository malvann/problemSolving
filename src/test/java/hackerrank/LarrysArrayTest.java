package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LarrysArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> grid, String result) {
        assertEquals(result, new LarrysArray().larrysArray(grid));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 5, 4)), "NO"),
                Arguments.of(new ArrayList<>(List.of(1, 3, 4, 2)), "YES"),
                Arguments.of(new ArrayList<>(List.of(1, 6, 5, 2, 4, 3)), "YES"),
                Arguments.of(new ArrayList<>(List.of(3, 1, 2)), "YES"));
    }
}