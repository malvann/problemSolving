package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AlmostSorted {
    public static final String SWAP = "%s\nswap %d %d";
    public static final String REVERSE = "%s\nreverse %d %d";
    public static final String YES = "yes";
    public static final String NO = "no";
    private List<Integer> nums;

    public void almostSorted(List<Integer> nums) {
        System.out.println(isAlmostSorted(nums));
    }

    public String isAlmostSorted(List<Integer> nums) {
        if (nums.size() == 1) return YES;
        this.nums = nums;

        if (nums.size() == 2 && !isNextBigger(0)) return SWAP.formatted(YES, 1, 2);

        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.size() - 1; i++) {
            if (isNextBigger(i)) continue;
            if (res.size() == 1) return NO;

            //swap available
            if (i + 1 < nums.size() - 1 && isNextBigger(i + 1)) {
                int endIndex = getSwapIndex(i);
                swap(i, endIndex);
                res.add(SWAP.formatted(YES, i + 1, endIndex + 1));
                i = -1;

                //reverse available
            } else {
                int endIndex = getReverseIndex(i);
                if (nums.get(i - 1) <= nums.get(endIndex + 1) && nums.get(i) <= nums.get(endIndex + 1)) {
                    res.add(REVERSE.formatted(YES, i + 1, endIndex + 1));
                    i = endIndex;
                }
            }
        }
        return res.isEmpty() ? NO : res.get(0);
    }

    private int getSwapIndex(int index) {
        int target = index + 1;
        do {
            if (!isNextBigger(target)) return ++target;
            target++;
        } while (target < nums.size() - 2);
        return ++index;
    }

    private int getReverseIndex(int index) {
        while (index < nums.size() - 2 && !isNextBigger(index)) {
            index++;
        }
        return index;
    }

    private boolean isNextBigger(int currentInd) {
        return nums.get(currentInd) <= nums.get(currentInd + 1);
    }

    private void swap(int i, int j) {
        int buff = nums.get(i);
        nums.set(i, nums.get(j));
        nums.set(j, buff);
    }
}
