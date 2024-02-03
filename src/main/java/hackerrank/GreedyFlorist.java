package hackerrank;

import java.util.Arrays;

public class GreedyFlorist {
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);

        int cost = 0;
        int[] people = new int[k];
        for (int i = c.length - 1; i > -1; i--) {
            int personIndex = i % k;
            cost += c[i] * (people[personIndex] + 1);
            people[personIndex]++;
        }

        return cost;
    }
}
