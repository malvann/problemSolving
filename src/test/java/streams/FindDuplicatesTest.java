package streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindDuplicatesTest {
    @Test
    void test() {
        assertArrayEquals(new Integer[]{98, 15}, new FindDuplicates().findDuplicates(new int[]{10, 15, 8, 49, 25, 98, 98, 32, 15}));
    }

}