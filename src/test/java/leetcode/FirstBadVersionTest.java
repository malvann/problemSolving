package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstBadVersionTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int numOfVersions, int badVersion) {
        assertEquals(badVersion, new FirstBadVersion(badVersion).firstBadVersion(numOfVersions));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(2126753390, 1702766719),
                Arguments.of(4, 1),
                Arguments.of(5, 4),
                Arguments.of(1, 1)
        );
    }
}