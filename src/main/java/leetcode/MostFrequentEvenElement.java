package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if ((num & 1) == 0) {
                map.computeIfPresent(num, (k, v) -> ++v);
                map.putIfAbsent(num, 1);
            }
        }
        return getMax(map);
    }

    private int getMax(Map<Integer, Integer> map) {
        return map.entrySet().stream().min((o1, o2) -> {
            if (Objects.equals(o2.getValue(), o1.getValue())) return o1.getKey() - o2.getKey();
            return o2.getValue() - o1.getValue();
        }).map(Map.Entry::getKey).orElse(-1);
    }
}
