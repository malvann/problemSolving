package hackerrank;

import java.util.List;

public class TwoDArrayDS {
    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSumm = Integer.MIN_VALUE;
        int currSum;
        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = 0; j < arr.get(i).size() - 2; j++) {
                currSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                          + arr.get(i + 1).get(j + 1)
                          + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2);
                maxSumm = Math.max(currSum, maxSumm);
            }
        }
        return maxSumm;
    }
}
