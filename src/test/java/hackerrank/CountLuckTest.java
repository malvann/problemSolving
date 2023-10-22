package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountLuckTest {

    @ParameterizedTest
    @MethodSource("loadedData")
    void test(List<String> matrix, int k, String result) {
        assertEquals(result, CountLuck.countLuck(matrix, k));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                ".X.X......X",
                                ".X*.X.XXX.X",
                                ".XX.X.XM...",
                                "......XXXX."),
                        40, "Oops!"),
                Arguments.of(
                        List.of(
                                ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.",
                                "M.......................................*",
                                ".X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X."),
                        20, "Impressed"),
                Arguments.of(
                        List.of(
                                "..........*",
                                ".XXXXXXXXXX",
                                "...........",
                                "XXXXXXXXXX.",
                                "M.......... "),
                        0, "Impressed"),
                Arguments.of(
                        List.of(
                                "*.M",
                                ".X."),
                        1, "Impressed"),
                Arguments.of(
                        List.of(
                                ".X.X......X",
                                ".X*.X.XXX.X",
                                ".XX.X.XM...",
                                "......XXXX."),
                        3, "Impressed"),
                Arguments.of(
                        List.of(
                                ".X.X......X",
                                ".X*.X.XXX.X",
                                ".XX.X.XM...",
                                "......XXXX."),
                        4, "Oops!")
        );
    }

    private static Stream<Arguments> loadedData() {
        Iterator<List<String>> iterator = getMatrix().iterator();
        return Stream.of(
                Arguments.of(iterator.next(), 20, "Impressed"),
                Arguments.of(iterator.next(), 0, "Impressed"),
                Arguments.of(iterator.next(), 1, "Impressed"),
                Arguments.of(iterator.next(), 280, "Impressed"),
                Arguments.of(iterator.next(), 10, "Oops!"),
                Arguments.of(iterator.next(), 294, "Impressed")
        );
    }

    private static List<List<String>> getMatrix() {
        List<List<String>> res = new ArrayList<>();
        for (String arr : source) {
            res.add(List.of(arr.split("\n")));
        }
        return res;
    }

    private static final List<String> source = List.of("""
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    M.......................................*
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.""",
            """
                    ..........*
                    .XXXXXXXXXX
                    ...........
                    XXXXXXXXXX.
                    M..........""",
            """
                    XXXXXXXXXXXXXXXXX
                    XXX.XX.XXXXXXXXXX
                    XX.*..M.XXXXXXXXX
                    XXX.XX.XXXXXXXXXX
                    XXXXXXXXXXXXXXXXX""",

            """
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    M........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .*.......................................""",

            """
                    XXXXXXXXXXXXXXXXX
                    XXX.XX.XXXXXXXXXX
                    XX.*..M.XXXXXXXXX
                    XXX.XX.XXXXXXXXXX
                    XXXXXXXXXXXXXXXXX""",

            """
                    .X.XXXXXXXXXXXXXXXXXXX.X.X.X.X.X.X.X.X.X.
                    ...XXXXXXXXXXXXXXXXXXX...................
                    .X..X.X.X.X.X.X.X..XXXX*X.X.X.X.X.X.X.XX.
                    .XXXX.X.X.X.X.X.X.XX.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .XX.X.X.X.XX.X.XX.X.X.X.X.X.X.X.X.X.X.X.X
                    .X.X.X.X.X.XXX.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    X........................................
                    X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    .X.XX.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XMX.
                    .X....................................X..
                    ..X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .X...................................X...
                    .XX.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.XX.XXXX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................
                    X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.XX.
                    .X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.X.
                    .........................................""");
}