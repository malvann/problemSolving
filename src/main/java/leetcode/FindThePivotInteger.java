package leetcode;

public class FindThePivotInteger {
    public int pivotInteger(int n) {
        if (n == 1) return 1;

        int k = 1;
        int hSum = 1;
        int tSum = n;
        while (k != n) {
            if (hSum < tSum) hSum += ++k;
            else tSum += --n;
            if (hSum == tSum && n - k == 1) return -1;
        }
        return hSum != tSum ? -1 : k;
    }
}
