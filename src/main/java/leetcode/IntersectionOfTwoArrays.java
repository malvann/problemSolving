package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> res = new HashSet<>();

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) i++;
            else j++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersection1(int[] nums1, int[] nums2) {
        Set<Integer> res = IntStream.of(nums1).boxed().collect(Collectors.toSet());
        res.retainAll(IntStream.of(nums2).boxed().collect(Collectors.toSet()));
        return res.stream().mapToInt(i -> i).toArray();
    }
}
