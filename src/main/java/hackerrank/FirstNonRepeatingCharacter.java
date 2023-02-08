package hackerrank;

import java.util.Arrays;

public class FirstNonRepeatingCharacter {
    public int find(char[] chars) {
        int[] uniques = new int[chars.length];
        Arrays.fill(uniques, 256);

        for (int n : chars) {
            for (int i = 0; i < uniques.length; i++) {
                if (uniques[i] == 256) {
                    uniques[i] = n;
                    break;
                } else if (uniques[i] == n) {
                    int k = i;
                    while (uniques[k] != 256) {
                        uniques[k] = uniques[k + 1];
                        k++;
                    }
                    break;
                }
            }
        }
        return uniques[0];
    }
}
