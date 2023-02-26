package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ReverseStringTest {
    @Test
    void test() {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        new ReverseString().reverseString(chars);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, chars);
    }
}