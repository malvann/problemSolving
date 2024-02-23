package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trusts) {
        if (n == 1 && trusts.length == 0) return 1;

        Map<Integer, Integer> posTrustCountMap = new HashMap<>();
        Set<Integer> trustedPos = new HashSet<>();
        for (int[] trust : trusts) {
            posTrustCountMap.computeIfPresent(trust[1], (k, v) -> ++v);

            if (posTrustCountMap.containsKey(trust[0])) posTrustCountMap.remove(trust[0]);
            else if (trustedPos.contains(trust[1])) posTrustCountMap.remove(trust[1]);
            else posTrustCountMap.putIfAbsent(trust[1], 1);

            trustedPos.add(trust[0]);
        }
        return posTrustCountMap.entrySet().stream().filter(e -> e.getValue() == n - 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
    }
}
