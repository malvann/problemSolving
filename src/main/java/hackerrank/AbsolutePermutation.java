package hackerrank;

import java.util.List;
import java.util.stream.IntStream;

public class AbsolutePermutation {
    private static int[] res;

    public static List<Integer> absolutePermutation(int n, int k) {
        res = new int[n];
        for (int num = 1; num <= n; num++) {
            if (insertNum(num - k, num, n)) continue;
            if (insertNum(num + k, num, n)) continue;
            return List.of(-1);
        }
        return IntStream.of(res).boxed().toList();
    }

    private static boolean insertNum(int index, int num, int n) {
        if (index > 0 && index <= n && res[index - 1] == 0) {
            res[index - 1] = num;
            return true;
        }
        return false;
    }
}
