package leetcode;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][]{newInterval};

        List<int[]> res = new ArrayList<>();
        // find start interval
        int startIntervalIndex = findStartIntervalIndex(intervals, 0, intervals.length - 1, newInterval[0]);
        boolean newIsMerged = false;
        for (int i = 0; i < intervals.length; i++) {
            if (i < startIntervalIndex) res.add(intervals[i]);
            else if (newIsMerged) {
                if (res.get(res.size() - 1)[1] < intervals[i][0]) res.add(intervals[i]);
                else if (res.get(res.size() - 1)[1] <= intervals[i][1]) res.get(res.size() - 1)[1] = intervals[i][1];
            } else {
                // start case
                if (newInterval[1] < intervals[i][0]) {
                    res.add(newInterval);
                    res.add(intervals[i]);
                }
                // put after
                else if (intervals[i][1] < newInterval[0]) {
                    res.add(intervals[i]);
                    res.add(newInterval);
                }
                // merge
                else {
                    res.add(intervals[i]);
                    res.get(res.size() - 1)[0] = Math.min(intervals[i][0], newInterval[0]);
                    res.get(res.size() - 1)[1] = Math.max(intervals[i][1], newInterval[1]);
                }
                newIsMerged = true;
            }
        }

        return res.toArray(int[][]::new);
    }

    private int findStartIntervalIndex(int[][] intervals, int from, int to, int startVal) {
        if (from == to) return from;
        int mid = from + (to - from) / 2;
        if (intervals[mid][0] <= startVal && intervals[mid + 1][0] > startVal) return mid;

        if (intervals[mid][0] > startVal) return findStartIntervalIndex(intervals, from, mid, startVal);
        return findStartIntervalIndex(intervals, mid + 1, to, startVal);
    }
}
