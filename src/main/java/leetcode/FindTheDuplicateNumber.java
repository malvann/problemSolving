package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int[] matrix = new int[100000];
        for (int n : nums) {
            if (matrix[n - 1] != 0) return n;
            matrix[n - 1] = 1;
        }
        return 0;
    }

    public int findDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            int size = set.size();
            set.add(n);
            if (size == set.size()) return n;
        }
        return 0;
    }
}
