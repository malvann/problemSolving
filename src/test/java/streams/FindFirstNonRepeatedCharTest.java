package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindFirstNonRepeatedCharTest {
    @Test
    void test() {
        assertEquals('j', new FindFirstNonRepeatedChar().findFirstNonRepeatedChar("ghdjghdyte"));
    }
}