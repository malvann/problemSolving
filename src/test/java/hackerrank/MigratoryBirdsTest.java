package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MigratoryBirdsTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> birds, int result) {
        assertEquals(result, MigratoryBirds.migratoryBirds(birds));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(1, 4, 4, 4, 5, 3), 4),
                Arguments.of(List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4), 3)
        );
    }
}