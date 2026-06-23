package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    void test() {
        LongestSubstringWithoutRepeatingCharacters target = new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, target.lengthOfLongestSubstring("dvdf"));
        assertEquals(1, target.lengthOfLongestSubstring(" "));
        assertEquals(3, target.lengthOfLongestSubstring("zxyzxyz"));
    }

}