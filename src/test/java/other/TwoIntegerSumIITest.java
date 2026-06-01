package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoIntegerSumIITest {
    @Test
    void test() {
        TwoIntegerSumII target = new TwoIntegerSumII();
        assertArrayEquals(new int[]{1, 2}, target.twoSum(new int[]{1, 2, 3, 4}, 3));
        assertArrayEquals(new int[]{2,7}, target.twoSum(new int[]{-5,-3,0,2,4,6,8}, 5));
    }
}