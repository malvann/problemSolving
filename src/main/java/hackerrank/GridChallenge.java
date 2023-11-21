package hackerrank;

import java.util.List;

public class GridChallenge {
    public static String gridChallenge(List<String> grid) {
        int prevLast = Integer.MIN_VALUE;
        for (String s : grid) {
            int first;
            int last;
            int[]arr;
            if (s.length() == 1) {
                first = s.charAt(0);
                last = s.charAt(0);
            } else {
                arr = s.chars().sorted().toArray();
                first = arr[0];
                last = arr[s.length() - 1];
            }

            if (prevLast > first) return "NO";
            prevLast = last;
        }
        return "YES";
    }
}
