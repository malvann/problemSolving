package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BillDivisionTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> bill, int k, int b, String result) {
        assertEquals(result, BillDivision.bonAppetit(bill, k, b));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(3, 10, 2, 9), 1, 12, "5"),
                Arguments.of(List.of(3, 10, 2, 9), 1, 7, "Bon Appetit")
        );
    }
}