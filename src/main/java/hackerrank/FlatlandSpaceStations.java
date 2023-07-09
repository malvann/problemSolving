package hackerrank;

import java.util.Arrays;

public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int citiesNum, int[] cityIndWithStation) {
        if (citiesNum == cityIndWithStation.length) return 0;

        int maxDistance = 0;
        int station = -1;
        int distance;
        Arrays.sort(cityIndWithStation);
        for (int index : cityIndWithStation) {
            if (station == -1) distance = index;
            else distance = (index - station) / 2;
            station = index;
            maxDistance = Math.max(maxDistance, distance);
        }
        maxDistance = Math.max(maxDistance, citiesNum - station - 1);

        return maxDistance;
    }
}
