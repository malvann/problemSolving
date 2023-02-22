package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindAllTheEvenNumbersTest {
    @Test
    void test() {
        assertArrayEquals(new Integer[]{10, 8, 98, 32},
                new FindAllTheEvenNumbers().findAllTheEvenNumbers(new int[]{10, 15, 8, 49, 25, 98, 32})
        );
    }
}