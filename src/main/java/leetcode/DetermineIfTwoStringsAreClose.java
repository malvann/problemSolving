package leetcode;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetermineIfTwoStringsAreClose {
    public boolean closeStrings(String word1, String word2) {
        if (word2.length() != word1.length()) return false;

        Map<Integer, Long> currentMap = word1.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<Integer, Long> targetMap = word2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        if (!currentMap.values().containsAll(targetMap.values())) return false;

        Iterator<Map.Entry<Integer, Long>> tIter = targetMap.entrySet().stream()
                .sorted((o1, o2) -> Math.toIntExact(o1.getValue() - o2.getValue()))
                .iterator();
        Iterator<Map.Entry<Integer, Long>> cIter = currentMap.entrySet().stream()
                .sorted((o1, o2) -> Math.toIntExact(o1.getValue() - o2.getValue()))
                .iterator();
        for (int i = 0; i < currentMap.size(); i++) {
            Map.Entry<Integer, Long> target = tIter.next();
            Map.Entry<Integer, Long> current = cIter.next();

            if (!target.getValue().equals(current.getValue())) return false;
            if (!targetMap.containsKey(current.getKey())) return false;
        }
        return true;
    }
}
