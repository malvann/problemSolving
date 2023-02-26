package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsInAStringTest {
    @Test
    void test() {
        String line = "Let's take LeetCode contest";
        assertEquals(
                "s'teL ekat edoCteeL tsetnoc",
                new ReverseWordsInAString().reverseWords(line));
    }
}