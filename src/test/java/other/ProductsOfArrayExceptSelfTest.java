package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ProductsOfArrayExceptSelfTest {
    @Test
    void test() {
        ProductsOfArrayExceptSelf target = new ProductsOfArrayExceptSelf();
        assertArrayEquals(new int[]{48, 24, 12, 8}, target.productExceptSelf(new int[]{1, 2, 4, 6}));
        assertArrayEquals(new int[]{0, -6, 0, 0, 0}, target.productExceptSelf(new int[]{-1, 0, 1, 2, 3}));
        assertArrayEquals(new int[]{}, target.productExceptSelf(new int[]{}));
    }
}