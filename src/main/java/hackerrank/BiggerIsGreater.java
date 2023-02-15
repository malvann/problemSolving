package hackerrank;

import java.util.Comparator;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

public class BiggerIsGreater {
    private static final String NO_RESULT = "no answer";

    public static String biggerIsGreater(String word) {
        if (word.length() == 1) return NO_RESULT;

        char[] chars = word.toCharArray();
        Queue<Character> sorted = new PriorityQueue<>(word.length(), Comparator.comparingInt(o -> o));
        sorted.add(chars[chars.length - 1]);

        int index = chars.length - 2;
        while (index != -1) {
            char current = chars[index];
            Optional<Character> target = sorted.stream().filter(ch -> ch > current).findFirst();
            if (target.isPresent()) {
                sorted.remove(target.get());
                sorted.add(current);
                StringBuilder sb = new StringBuilder(word.substring(0, index));
                sb.append(target.get());
                sorted.stream().sorted().forEach(sb::append);
                return sb.toString();
            }
            sorted.add(current);
            index--;
        }

        return NO_RESULT;
    }
}
