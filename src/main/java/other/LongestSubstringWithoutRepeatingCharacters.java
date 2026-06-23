package other;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            uniqueChars.clear();
            for (int j = i; j < s.length(); j++) {
                if (!uniqueChars.add(s.charAt(j))) break;
            }
            res = Math.max(res, uniqueChars.size());
        }
        return res;
    }
}
