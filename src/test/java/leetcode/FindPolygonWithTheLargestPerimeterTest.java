package leetcode;

import leetcode.FindPolygonWithTheLargestPerimeter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPolygonWithTheLargestPerimeterTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] c, long result) {
        assertEquals(result, new FindPolygonWithTheLargestPerimeter().largestPerimeter(c));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{300005055, 352368231, 311935527, 315829776, 327065463, 388851949, 319541150, 397875604, 311309167, 391897750, 366860048, 359976490, 325522439, 390648914, 359891976, 369105322, 350430086, 398592583, 354559219, 372400239, 344759294, 379931363, 308829137, 335032174, 336962933, 380797651, 378305476, 336617902, 393487098, 301391791, 394314232, 387440261, 316040738, 388074503, 396614889, 331609633, 374723367, 380418460, 349845809, 318514711, 308782485, 308291996, 375362898, 397542455, 397628325, 392446446, 368662132, 378781533, 372327607, 378737987}, 17876942274l),
                Arguments.of(new int[]{5, 5, 5}, 15),
                Arguments.of(new int[]{1, 12, 1, 2, 5, 50, 3}, 12),
                Arguments.of(new int[]{5, 5, 50}, -1)
        );
    }
}