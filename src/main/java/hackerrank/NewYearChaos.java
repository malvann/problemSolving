package hackerrank;

import java.util.Collections;
import java.util.List;

public class NewYearChaos {
    private static final String TO_CHAOTIC = "Too chaotic";

    public static void minimumBribes(List<Integer> q) {
        System.out.println(getMinimumBribes(q));
    }

    public static String getMinimumBribes(List<Integer> q) {
        int counter = 0;
        for (int i = q.size() - 1; i > -1; i--) {
            if (q.get(i) != i + 1) {
                if (q.get(i - 1) == i + 1) {
                    counter++;
                    Collections.swap(q, i, i - 1);
                } else if (q.get(i - 2) == i + 1) {
                    counter += 2;
                    Collections.swap(q, i - 2, i);
                    Collections.swap(q, i - 2, i - 1);
                } else return TO_CHAOTIC;
            }
        }

        return counter == 0 ? TO_CHAOTIC : String.valueOf(counter);
    }
}
