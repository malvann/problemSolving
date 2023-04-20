package leetcode;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        for (int i = nums1.length - 1; i > -1; i--) {
            if (m > -1) {
                if (n > -1) {
                    if (nums1[m] > nums2[n]) nums1[i] = nums1[m--];
                    else nums1[i] = nums2[n--];
                } else {
                    nums1[i] = nums1[m--];
                }
            } else {
                nums1[i] = nums2[n--];
            }
        }
    }
}
