package other;

import java.util.stream.IntStream;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int[] array = IntStream.of(nums).distinct().sorted().toArray();
        if (array.length == 0) return 0;
        if (array.length == 1) return 1;

        int tmp = 1;
        int res = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 == array[i + 1]) {
                tmp++;
                if (i + 1 == array.length - 1 && res < tmp) res = tmp;
            } else {
                if (res < tmp) res = tmp;
                tmp = 1;
            }
        }
        return res;
    }
}
