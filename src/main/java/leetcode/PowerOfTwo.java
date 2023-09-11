package leetcode;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int x) {
        if (x==-2147483648) return false;
        return (x != 0) && ((x & (x - 1)) == 0);
    }
}
