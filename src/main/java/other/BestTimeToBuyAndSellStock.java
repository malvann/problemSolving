package other;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int result = 0;
        int profit;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = prices[j] - prices[i];
                if (profit > 0 && result < profit) result = profit;
            }
        }
        return result;
    }
}
