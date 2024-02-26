package leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] trip = IntStream.generate(() -> Integer.MAX_VALUE).limit(n).toArray();
        trip[src] = 0;

        while (k-- > -1) {
            int[] temp = Arrays.copyOf(trip, n);
            for (int[] flight : flights) {
                if (trip[flight[0]] == Integer.MAX_VALUE) continue;
                temp[flight[1]] = Math.min(temp[flight[1]], trip[flight[0]] + flight[2]);
            }
            trip = temp;
        }

        return trip[dst] == Integer.MAX_VALUE ? -1 : trip[dst];
    }
}
