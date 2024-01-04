package hackerrank;

import java.util.List;
import java.util.stream.Collectors;

public class VowelSubstring {
    private static final String NO = "Not found!";
    private static final List<Integer> VOWELS = List.of(
            (int) 'a',
            (int) 'e',
            (int) 'i',
            (int) 'o',
            (int) 'u');

    public static String findSubstring(String s, int k) {
        if (s.length() < k) return NO;

        List<Boolean> collect = s.chars().mapToObj(VOWELS::contains).toList();

        int start = 0;
        int end = k;
        long vowelCount = collect.subList(start, end).stream().filter(b -> b).count();
        long substringVC = vowelCount;
        for (int i = 1; i < collect.size() - k + 1; i++) {
            substringVC = substringVC
                    - (collect.get(i - 1) ? 1 : 0)
                    + (collect.get(i + k - 1) ? 1 : 0);

            if (vowelCount < substringVC) {
                start = i;
                end = i + k;
                vowelCount = substringVC;
            }
        }

        return vowelCount == 0 ? NO : s.substring(start, end);
    }
}
