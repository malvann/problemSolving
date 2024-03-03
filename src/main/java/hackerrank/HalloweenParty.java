package hackerrank;

public class HalloweenParty {
    public static long halloweenParty(int k) {
        long floor = (long) k / 2;
        return floor * floor + (k % 2 == 0 ? 0 : floor);
    }
}
