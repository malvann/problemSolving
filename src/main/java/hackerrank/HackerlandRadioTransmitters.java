package hackerrank;

import java.util.List;

public class HackerlandRadioTransmitters {
    public static int hackerlandRadioTransmitters(List<Integer> housesLocation, int transmitterRange) {
        int transmittersNum = 0;
        int transmitterLocation = -1;

        housesLocation.sort(Integer::compareTo);
        for (int i = 0; i < housesLocation.size() - 1; i++) {
            if (housesLocation.get(i + 1) - housesLocation.get(i) > transmitterRange
                    || (housesLocation.get(i + 1) - housesLocation.get(i) == transmitterRange
                    && housesLocation.get(i) != transmitterLocation)) {
                transmittersNum++;
                transmitterLocation = housesLocation.get(i + 1);
            } else {
                if (housesLocation.get(i + 1) - transmitterLocation > transmitterRange) {
                    transmittersNum++;
                    transmitterLocation = housesLocation.get(i + 1);
                }
            }
        }

        return transmittersNum;
    }
}
