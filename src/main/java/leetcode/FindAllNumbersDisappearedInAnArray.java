package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) list.add(j + 1);
        }
        return list;
    }

    void swap(int[] arr, int i, int j) {
        int buff = arr[i];
        arr[i] = arr[j];
        arr[j] = buff;
    }
}
