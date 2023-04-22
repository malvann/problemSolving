package leetcode;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int j : arr) {
            if ((nums.contains(j / 2) && j % 2 == 0) || nums.contains(j * 2)) return true;
            nums.add(j);
        }
        return false;
    }
}
