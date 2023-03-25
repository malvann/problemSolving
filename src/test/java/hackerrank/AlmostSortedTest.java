package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AlmostSortedTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> nums, String result) {
        assertEquals(result, new AlmostSorted().isAlmostSorted(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(4104, 8529, 49984, 54956, 63034, 82534, 84473, 86411, 92941, 95929, 108831, 894947, 125082, 137123, 137276, 142534, 149840, 154703, 174744, 180537, 207563, 221088, 223069, 231982, 249517, 252211, 255192, 260283, 261543, 262406, 270616, 274600, 274709, 283838, 289532, 295589, 310856, 314991, 322201, 339198, 343271, 383392, 385869, 389367, 403468, 441925, 444543, 454300, 455366, 469896, 478627, 479055, 484516, 499114, 512738, 543943, 552836, 560153, 578730, 579688, 591631, 594436, 606033, 613146, 621500, 627475, 631582, 643754, 658309, 666435, 667186, 671190, 674741, 685292, 702340, 705383, 722375, 722776, 726812, 748441, 790023, 795574, 797416, 813164, 813248, 827778, 839998, 843708, 851728, 857147, 860454, 861956, 864994, 868755, 116375, 911042, 912634, 914500, 920825, 979477)), "yes\nswap 12 95"),
                Arguments.of(new ArrayList<>(List.of(43, 65, 1, 98, 99, 101)), "no"),
                Arguments.of(new ArrayList<>(List.of(1, 2, 4, 3, 5, 6)), "yes\nswap 3 4"),
                Arguments.of(new ArrayList<>(List.of(1, 2, 3, 5, 4, 6)), "yes\nswap 4 5"),
                Arguments.of(new ArrayList<>(List.of(4, 2)), "yes\nswap 1 2"),
                Arguments.of(new ArrayList<>(List.of(3, 1, 2)), "no"),
                Arguments.of(new ArrayList<>(List.of(1, 5, 4, 3, 2, 6)), "yes\nreverse 2 5"),
                Arguments.of(new ArrayList<>(List.of(1, 2, 5, 4, 3, 6)), "yes\nreverse 3 5")
        );
    }
}