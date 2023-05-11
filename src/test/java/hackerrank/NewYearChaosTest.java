package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewYearChaosTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> list, String result) {
        assertEquals(result, new NewYearChaos().getMinimumBribes(list));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1, 2, 5, 3, 7, 8, 6, 4)), "7"),
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 5, 4, 6, 7)), "1"),
                Arguments.of(new ArrayList<>(List.of(4, 1, 2, 3)), "Too chaotic"),
                Arguments.of(new ArrayList<>(List.of(2, 1, 5, 3, 4)), "3"),
                Arguments.of(new ArrayList<>(List.of(2, 5, 1, 3, 4)), "Too chaotic")
        );
    }
}
