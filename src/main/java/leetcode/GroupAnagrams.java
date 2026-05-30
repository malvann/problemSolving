package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            String key = str.chars().sorted().mapToObj(String::valueOf).collect(Collectors.joining());
            res.computeIfPresent(key, (intStream, strings) -> {
                strings.add(str);
                return strings;
            });
            List<String> list = new ArrayList<>();
            list.add(str);
            res.putIfAbsent(key, list);
        }
        return res.values().stream().toList();
    }
}
