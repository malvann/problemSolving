package streams;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class FinMaxNumInString {
    public int find(String s) {
        return Pattern.compile("\\d+").matcher(s).results()
                .map(MatchResult::group)
                .map(Integer::valueOf)
                .max(Integer::compareTo)
                .orElse(-1);
    }
}
