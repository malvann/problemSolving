package leetcode;

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int startInd = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                for (int j = i - 1; j >= startInd; j--) {
                    sb.append(s.charAt(j));
                }
                sb.append(s.charAt(i));
                startInd = i + 1;
            }
        }
        int i = s.length();
        while (--i >= startInd){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
