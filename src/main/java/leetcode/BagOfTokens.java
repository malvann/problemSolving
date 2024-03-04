package leetcode;

import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int counter = 0;
        int i = 0;
        int j = tokens.length - 1;
        while (i <= j) {
            if (power >= tokens[i]) {
                counter++;
                power -= tokens[i++];
            } else if (counter > 0 && i != j) {
                counter--;
                power += tokens[j--];
            } else break;
        }
        return counter;
    }
}
