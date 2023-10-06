package hackerrank;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSortPart2 {
    public static void insertionSort2(int n, List<Integer> arr) {
        String log;
        int k;
        for (int i = 1; i < n; i++) {
            k = i;
            while (k >= 1 && arr.get(k) < arr.get(k - 1)) {
                Collections.swap(arr, k, k - 1);
                k--;
            }
            log = arr.stream().map(Object::toString)
                    .collect(Collectors.joining(" "));
            if (i == n - 1) System.out.print(log);
            else System.out.println(log);
        }
    }
}
