package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Finding3DigitEvenNumbers {
    public int[] findEvenNumbers(int[] digits) {
        if (digits.length < 3) return new int[]{};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) continue;
            for (int j = 0; j < digits.length; j++) {
                if (j == i) continue;
                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) continue;
                    if ((digits[k] & 1) != 0) continue;
                    res.add(digits[i] * 100 + digits[j] * 10 + digits[k]);
                }
            }
        }
        return res.stream().sorted().distinct().mapToInt(Integer::intValue).toArray();
    }
}
