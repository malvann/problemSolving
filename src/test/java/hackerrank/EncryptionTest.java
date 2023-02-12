package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncryptionTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String from, String result) {
        assertEquals(result, Encryption.encryption(from));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("haveaniceday", "hae and via ecy"),
                Arguments.of("chillout", "clu hlt io")
        );
    }
}