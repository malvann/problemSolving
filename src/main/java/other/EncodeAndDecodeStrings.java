package other;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EncodeAndDecodeStrings {
    private static final String WORD_SEPARATOR = "-";
    private static final String CHAR_SEPARATOR = "/";
    private static final String EMPTY_STR = "_";

    public String encode(List<String> strs) {
        return strs.stream()
                .map(s ->
                        s.isEmpty()
                                ? EMPTY_STR
                                : s.chars()
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(CHAR_SEPARATOR))
                )
//                .map(s -> s.getBytes(StandardCharsets.US_ASCII))
                .map(Object::toString)
                .collect(Collectors.joining(WORD_SEPARATOR));
    }

    public List<String> decode(String str) {
        return Arrays.stream(str.split(WORD_SEPARATOR))
                .filter(s -> !s.isEmpty())
                .map(s ->
                        s.equals(EMPTY_STR)
                        ? ""
                        : Arrays.stream(s.split(CHAR_SEPARATOR))
                        .map(Integer::parseInt)
                        .map(Character::toString)
                        .collect(Collectors.joining())
                )
                .toList();
    }
}
