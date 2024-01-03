package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JimAndTheOrdersTest {
    @ParameterizedTest
    @MethodSource
    void test(List<List<Integer>> arr, List<Integer> res) {
        assertEquals(res, JimAndTheOrders.jimOrders(arr));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(List.of(1, 2), List.of(2, 3), List.of(3, 3)), List.of(1, 2, 3)),
                Arguments.of(List.of(List.of(8, 1), List.of(4, 2), List.of(5, 6), List.of(3, 1), List.of(4, 3)), List.of(4, 2, 5, 1, 3))
        );
    }
}
