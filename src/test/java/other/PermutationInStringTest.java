package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PermutationInStringTest {

    @Test
    void test() {
        PermutationInString target = new PermutationInString();
        assertFalse(target.checkInclusion("ab", "a"));
        assertTrue(target.checkInclusion("ky", "ainwkckifykxlribaypk"));
        assertTrue(target.checkInclusion("abc", "bbbca"));
        assertFalse(target.checkInclusion("hello", "ooolleoooleh"));
        assertFalse(target.checkInclusion("abc", "lecaabee"));
        assertTrue(target.checkInclusion("abc", "lecabee"));
        assertTrue(target.checkInclusion("", ""));
        assertTrue(target.checkInclusion("", "kfgaiudb"));
        assertTrue(target.checkInclusion("aaa", "kfgaaaiudba"));
    }
}