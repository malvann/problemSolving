package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        List<Integer> res = new ArrayList<>();
        IntStream.of(nums).boxed().forEach(num -> {
            if (!res.remove(num)) res.add(num);
        });
        return res.get(0);
    }
}
