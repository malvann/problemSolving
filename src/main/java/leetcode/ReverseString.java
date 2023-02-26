package leetcode;

public class ReverseString {
    public void reverseString(char[] s) {
        char buff;
        for (int i = 0; i < s.length / 2; i++) {
            buff = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = buff;
        }
    }
}
