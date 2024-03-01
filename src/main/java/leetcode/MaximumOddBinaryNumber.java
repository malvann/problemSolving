package leetcode;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstOneFound = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                if (!isFirstOneFound) isFirstOneFound = true;
                else sb.append('1');
            }
        }
        while (sb.length() < s.length() - 1) sb.append('0');
        sb.append('1');
        return sb.toString();
    }
}
