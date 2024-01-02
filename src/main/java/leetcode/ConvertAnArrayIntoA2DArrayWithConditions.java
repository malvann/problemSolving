package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ConvertAnArrayIntoA2DArrayWithConditions {

    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int num : nums) {
            boolean isAdded = false;
            for (List<Integer> list : res) {
                if (!list.contains(num)) {
                    list.add(num);
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) res.add(new ArrayList<>() {{add(num);}});
        }
        return res;
    }
}
