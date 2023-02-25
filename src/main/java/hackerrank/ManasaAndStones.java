package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManasaAndStones {
    public static List<Integer> stones(int n, int a, int b) {
        int sum = Collections.nCopies(n - 1, a).stream().reduce(Integer::sum).orElse(0);
        if (a == b) return List.of(sum);

        int delta = b - a;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(sum);
            sum += delta;
        }
        Collections.sort(result);
        return result;
    }
}
