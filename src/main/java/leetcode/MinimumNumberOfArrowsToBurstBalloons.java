package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 1) return 1;

        int counter = 0;

        List<int[]> matrix = new ArrayList<>();
        int maxArrLength = 0;
        for (int[] point : points) {
            int[] array = IntStream.concat(
                            IntStream.generate(() -> 0).limit(point[0]),
                            IntStream.generate(() -> 1).limit(point[1] - point[0] + 1))
                    .toArray();
            matrix.add(array);
            maxArrLength = Math.max(maxArrLength, point[1]);
        }

        while (!matrix.isEmpty()) {
//            find max intersection
            int maxIntersection = 0;
            List<int[]> affectedArraysIndexes = List.of();
            for (int j = 0; j < maxArrLength; j++) {
                int currentIntersection = 0;
                List<int[]> currentIntersectionArrays = new ArrayList<>();
                for (int[] ints : matrix) {
                    if (ints.length - 1 < j) continue;
                    currentIntersection += ints[j];
                    if (ints[j] == 1) currentIntersectionArrays.add(ints);
                }
                if (maxIntersection < currentIntersection) {
                    maxIntersection = currentIntersection;
                    affectedArraysIndexes = currentIntersectionArrays;
                }
            }
//            drop affected arrays
            affectedArraysIndexes.forEach(matrix::remove);
            if (maxIntersection == 0) {
                counter += matrix.size();
                break;
            } else counter++;
        }

        return counter;
    }
}
