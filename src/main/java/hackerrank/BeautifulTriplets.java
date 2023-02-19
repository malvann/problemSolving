package hackerrank;

import java.util.List;

public class BeautifulTriplets {
    public static int beautifulTriplets(int d, List<Integer> arr) {
        int counter = 0;
        if (arr.size() <= 2) return counter;

        for (int i = 0; i < arr.size() - 2; i++) {
            for (int j = i + 1; j < arr.size() - 1; j++) {
                if (arr.get(j) - arr.get(i) != d) continue;
                for (int k = j + 1; k < arr.size(); k++) {
                    if (arr.get(k) - arr.get(j) == d)
                        counter++;
                }
            }
        }
        return counter;
    }
}
