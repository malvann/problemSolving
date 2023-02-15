package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BiggerIsGreaterTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String from, String result) {
        assertEquals(result, BiggerIsGreater.biggerIsGreater(from));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("ab", "ba"),
                Arguments.of("bb", "no answer"),
                Arguments.of("hefg", "hegf"),
                Arguments.of("dhck", "dhkc"),
                Arguments.of("dkhc", "hcdk"),
                Arguments.of("lmno", "lmon"),
                Arguments.of("dcba", "no answer"),
                Arguments.of("dcbb", "no answer"),
                Arguments.of("abdc", "acbd"),
                Arguments.of("abcd", "abdc"),
                Arguments.of("fedcbabcd", "fedcbabdc")
        );
    }
}