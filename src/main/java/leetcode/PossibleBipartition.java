package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class PossibleBipartition {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        Set<Integer> g1Members = new HashSet<>();
        Set<Integer> g2Members = new HashSet<>();

        for (int[] dis : Arrays.stream(dislikes).sorted(Comparator.comparingInt(arr -> arr[0])).toList()) {
            if (g1Members.contains(dis[0])) {
                if (g1Members.contains(dis[1])) return false;
                g2Members.add(dis[1]);
            } else if (g2Members.contains(dis[0])) {
                if (g2Members.contains(dis[1])) return false;
                g1Members.add(dis[1]);
            } else if (g1Members.contains(dis[1])) g2Members.add(dis[0]);
            else if (g2Members.contains(dis[1])) g1Members.add(dis[0]);
            else {
                g1Members.add(dis[0]);
                g2Members.add(dis[1]);
            }
        }
        return true;
    }
}