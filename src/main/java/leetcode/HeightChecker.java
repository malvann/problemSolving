package leetcode;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = heights.clone();
        Arrays.sort(sortedHeights);

        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedHeights[i]) counter++;
        }
        return counter;
    }
}
