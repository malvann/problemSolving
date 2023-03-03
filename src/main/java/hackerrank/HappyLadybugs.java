package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class HappyLadybugs {
    private static final String SPACE = "_";
    private static final int SPACE_CH = '_';
    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String happyLadybugs(String line) {
        if (line.length() == 1) return line.equals(SPACE) ? YES : NO;

        Integer[] chars = line.chars().boxed().toArray(Integer[]::new);
        boolean needSpace = false;
        int needSpaceCount = 1;
        Map<Integer, Integer> charCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            int ch = chars[i];
            if (!needSpace && i < line.length() - 2) {
                if (ch != chars[i + 1]) {
                    if (needSpaceCount == 1) needSpace = true;
                    needSpaceCount = 0;
                }
                needSpaceCount++;
            }
            charCount.compute(ch, (k, v) -> (v == null) ? 1 : v + 1);
        }

        if (charCount.remove(SPACE_CH) == null && needSpace) return NO;
        return charCount.containsValue(1) ? NO : YES;
    }
}
