package hackerrank;

public class ViralAdvertising {
    public static int viralAdvertising(int n) {
        return viralAdvertising(n, 5, 0);
    }

    private static int viralAdvertising(int dayTimer, int initAmount, int cumulative) {
        if (dayTimer == 0) return cumulative;
        cumulative += initAmount / 2;
        return viralAdvertising(--dayTimer, initAmount / 2 * 3, cumulative);
    }
}
