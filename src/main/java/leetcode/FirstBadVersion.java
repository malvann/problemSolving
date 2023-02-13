package leetcode;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FirstBadVersion {
    private final int bad;

    public int firstBadVersion(int n) {
        return firstBadVersion(1, n);
    }

    private int firstBadVersion(int from, int to) {
        if (from == to) return from;
        int mid = from + (to - from) / 2;
        if (isBadVersion(mid)) {
            if (!isBadVersion(mid - 1)) return mid;
            return firstBadVersion(from, mid - 1);
        }
        return firstBadVersion(mid + 1, to);
    }

    private boolean isBadVersion(int n) {
        return n >= bad;
    }
}
