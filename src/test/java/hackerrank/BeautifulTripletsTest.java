package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeautifulTripletsTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int d, List<Integer> nums, int result) {
        assertEquals(result, BeautifulTriplets.beautifulTriplets(d, nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(3, List.of(1, 2, 4, 5, 7, 8, 10), 3)
        );
    }
}