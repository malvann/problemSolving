package hackerrank;

import java.util.List;

public class JumpingOnTheClouds {
    public static int jumpingOnClouds(List<Integer> c) {
        int jumpCounter = 0;
        int i = -1;
        while (++i < c.size() - 1) {
            if (i + 2 < c.size() && c.get(i) == 0 && c.get(i + 2) != 1) i++;
            jumpCounter++;
        }
        return jumpCounter;
    }
}
