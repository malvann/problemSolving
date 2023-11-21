package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GridChallengeTest {
    @ParameterizedTest
    @MethodSource
    void test(List<String> grid, String result) {
        assertEquals(result, GridChallenge.gridChallenge(grid));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(
                        "nyx",
                        "ynx",
                        "xyt"), "YES"),
                Arguments.of(List.of(
                        "vpvv",
                        "pvvv",
                        "vzzp",
                        "zzyy"), "YES"),
                Arguments.of(List.of(
                        "ebacd",
                        "fghij",
                        "olmkn",
                        "trpqs",
                        "xywuv"), "YES"),
                Arguments.of(List.of(
                        "ebacd",
                        "fghij",
                        "ebacd",
                        "trpqs",
                        "xywuv"), "NO"),
                Arguments.of(List.of(
                        "ppp",
                        "ypp",
                        "wyw"), "YES"),
                Arguments.of(List.of(
                        "lyivr",
                        "jgfew",
                        "uweor",
                        "qxwyr",
                        "uikjd"), "NO"),
                Arguments.of(List.of("l"), "YES")
        );
    }
}