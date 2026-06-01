package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestConsecutiveSequenceTest {
    @Test
    void test() {
        LongestConsecutiveSequence target = new LongestConsecutiveSequence();
        assertEquals(4, target.longestConsecutive(new int[]{2, 20, 4, 10, 3, 4, 5}));
        assertEquals(7, target.longestConsecutive(new int[]{0, 3, 2, 5, 4, 6, 1, 1}));
        assertEquals(1, target.longestConsecutive(new int[]{0, 0}));
        assertEquals(7, target.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
        assertEquals(4, target.longestConsecutive(new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7}));
    }
}