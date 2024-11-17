package leetcode;

import java.util.Arrays;
import java.util.List;

public class RemoveAllAdjacentDuplicatesInStringII {
    public String removeDuplicates(String s, int k) {
        List<Integer> str = s.chars().boxed().toList();
        int start = 0;
        while (true) {
            int ch = str.get(start);
            for (int i = start; i <= start + k && i < str.size(); i++) {
                if (ch != str.get(i)) break;
                if (i == start + k) str = str.subList(start, start + k);
                System.out.println(str);
            }
            start++;
            if (str.size() == s.length()) break;
        }
        return Arrays.toString(str.stream().map(c -> (char) c.intValue()).toArray());
    }
}
