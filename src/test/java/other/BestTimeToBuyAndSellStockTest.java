package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BestTimeToBuyAndSellStockTest {
    @Test
    void test() {
        var target = new BestTimeToBuyAndSellStock();
        assertEquals(6, target.maxProfit(new int[]{10, 1, 5, 6, 7, 1}));
    }
}