package hackerrank;

public class DownToZeroII {
    public static int downToZero(int n) {
        if (n == 0) return 0;

        int counter = 0;
        while (n > 1) {
            int d = (int) Math.sqrt(n);
            n -= d * d;
            counter++;
        }
        return counter + n;
    }
}
