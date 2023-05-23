package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClosestNumbers {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        if (Objects.isNull(arr) || arr.isEmpty() || arr.size() == 1) return List.of();

        arr.sort(Integer::compareTo);
        int minDistance = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++){
            int delta = arr.get(i+1) - arr.get(i);
            if (delta < minDistance) {
                minDistance = delta;
                result.clear();
                result.add(arr.get(i));
                result.add(arr.get(i+1));
            } else if (delta == minDistance) {
                result.add(arr.get(i));
                result.add(arr.get(i+1));
            }
        }
        return result;
    }
}
