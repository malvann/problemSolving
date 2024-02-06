package hackerrank;

import java.util.List;

import static java.lang.Math.max;

public class StockMaximize {
    public static long stockmax(List<Integer> p) {
        long res = 0;
        int maxNum = 0;
        for (int i = p.size() - 1; i >= 0; i--) {
            maxNum = max(maxNum, p.get(i));
            res += max(0, maxNum - p.get(i));
        }
        return res;
    }
}
