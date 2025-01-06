package leetcode;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {
    public int[] minOperations(String boxes) {
        int[] res = new int[boxes.length()];

        int n = 0;
        int s = 0;
        for (int i = 0; i < res.length; i++) {
            s = s + n;
            res[i] = s;
            if (boxes.charAt(i) == '1') n++;
        }
        n = 0;
        s = 0;
        for (int i = res.length - 1; i > -1; i--) {
            s = s + n;
            res[i] = res[i] + s;
            if (boxes.charAt(i) == '1') n++;
        }
        return res;
    }
}
