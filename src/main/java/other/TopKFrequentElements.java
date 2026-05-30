package other;

import java.util.HashMap;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> nMap = new HashMap<>();
        for (int num : nums) {
            nMap.computeIfPresent(num, (key, val) -> ++val);
            nMap.putIfAbsent(num, 1);
        }
        return nMap.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue()))
                .limit(k).mapToInt(Map.Entry::getKey).toArray();
    }
}
