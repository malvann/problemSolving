package leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Queue<Integer> indexes = new PriorityQueue<>();

        for (int i = temperatures.length - 1; i >= 0; --i) {
            if (indexes.isEmpty()) {
                indexes.offer(i);
                result[i] = 0;
                continue;
            }

            while (!indexes.isEmpty() && temperatures[i] >= temperatures[indexes.peek()]) {
                indexes.poll();
            }
            result[i] = indexes.isEmpty()
                    ? 0
                    : indexes.peek() - i;
            indexes.offer(i);
        }

        return result;
    }
}
