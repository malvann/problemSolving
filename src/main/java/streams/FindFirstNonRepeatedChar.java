package streams;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {

    public char findFirstNonRepeatedChar(String s) {
        int ch = s.chars().boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().orElseThrow().getKey();
        return (char) ch;
    }
}
