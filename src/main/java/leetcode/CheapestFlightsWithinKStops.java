package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] flCosts = IntStream.generate(() -> Integer.MAX_VALUE).limit(n).toArray();
        flCosts[src] = 0;

        while (k-- > -1) {
            int[] temp = Arrays.copyOf(flCosts, n);
            for (int[] flight : flights) {
                if (flCosts[flight[0]] == Integer.MAX_VALUE) continue;
                temp[flight[1]] = Math.min(temp[flight[1]], flight[2] + flCosts[flight[0]]);
            }
            flCosts = temp;
        }
        return flCosts[dst] == Integer.MAX_VALUE ? -1 : flCosts[dst];
    }
}
