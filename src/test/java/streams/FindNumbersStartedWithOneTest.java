package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindNumbersStartedWithOneTest {
    @Test
    void test() {
        assertArrayEquals(
                new Integer[]{10, 15, 15},
                new FindNumbersStartedWithOne().findNumbersStartedWithOne(new int[]{10, 15, 8, 49, 25, 98, 98, 32, 15}));
    }

}