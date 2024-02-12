package hackerrank;

public class SherlockAndSquares {
    public static int squares(int a, int b) {
        int lim1 = (int) Math.ceil(Math.sqrt(a));
        int lim2 = (int) Math.floor(Math.sqrt(b));

        return lim1 <= lim2
                ? lim2 - lim1 + 1
                : 0;
    }
}
