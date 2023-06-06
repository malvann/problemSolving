package hackerrank;

import java.util.List;

public class TheMaximumSubarray {
    public static List<Integer> maxSubarray(List<Integer> arr) {
        int max = arr.get(0);
        int maxSubArr = arr.get(0);
        int maxSubSequence = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            int num = arr.get(i);
            max = Math.max(max + num, num);
            maxSubArr = Math.max(maxSubArr, max);
            maxSubSequence = Math.max(Math.max(maxSubSequence, num), maxSubSequence + num);
        }
        return List.of(maxSubArr, maxSubSequence);
    }
}
