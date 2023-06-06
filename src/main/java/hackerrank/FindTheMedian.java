package hackerrank;

import java.util.Collections;
import java.util.List;

public class FindTheMedian {
    public static int findMedian(List<Integer> arr) {
        Collections.sort(arr);
        int ind = arr.size() / 2;
        return (arr.size() & 1) == 0
                ? (arr.get(ind) + arr.get(ind - 1)) / 2
                : arr.get(ind);
    }
}
