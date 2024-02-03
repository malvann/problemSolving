package hackerrank;

import java.util.List;

public class PermutingTwoArrays {
    public static String twoArrays(int targetSum, List<Integer> aList, List<Integer> bList) {
        aList.sort(Integer::compareTo);
        bList.sort((o1, o2) -> o2 - o1);
        for (int i = 0; i < aList.size(); i++) {
            if (aList.get(i) + bList.get(i) < targetSum) return "NO";
        }
        return "YES";
    }
}
