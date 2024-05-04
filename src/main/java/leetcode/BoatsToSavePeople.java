package leetcode;

import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boatCounter = 0;
        for (int i = 0, j = people.length - 1; i <= j; i++, j--) {
            int pearWeight = people[i] + people[j];
            if (pearWeight > limit) i--;
            boatCounter++;
        }
        return boatCounter;
    }
}
