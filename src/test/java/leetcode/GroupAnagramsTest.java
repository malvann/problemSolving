package leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        String[] source = new String[]{""};
        List<List<String>> actual = new GroupAnagrams().groupAnagrams(source);
        assertEquals(List.of(List.of("")), actual);
    }
}