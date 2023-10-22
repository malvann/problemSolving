package hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortPart2Test {
    private final ByteArrayOutputStream buff = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(buff));
    }

    @ParameterizedTest
    @MethodSource
    void test(int n, List<Integer> arr, List<Integer> res, String log) {
        InsertionSortPart2.insertionSort2(n, arr);
        assertEquals(res, arr);
        assertEquals(log, buff.toString());
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(
                        7,
                        new ArrayList<>(List.of(3, 4, 7, 5, 6, 2, 1)),
                        List.of(1, 2, 3, 4, 5, 6, 7),
                        """
                                3 4 7 5 6 2 1
                                3 4 7 5 6 2 1
                                3 4 5 7 6 2 1
                                3 4 5 6 7 2 1
                                2 3 4 5 6 7 1
                                1 2 3 4 5 6 7"""),
                Arguments.of(6,
                        new ArrayList<>(List.of(1, 4, 3, 5, 6, 2)),
                        List.of(1, 2, 3, 4, 5, 6),
                        """
                                1 4 3 5 6 2
                                1 3 4 5 6 2
                                1 3 4 5 6 2
                                1 3 4 5 6 2
                                1 2 3 4 5 6""")
        );
    }
}