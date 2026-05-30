package leetcode;

public class LargestNumber {
//    Input: nums = [3,30,34,5,9]
    //3, 30, 34
    //9, 90, 94
    //7, 77, 776, 779 - 779,77,7,776
//    Output: "9534330"
    public String largestNumber(int[] nums) {
        return "";
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] sortedS = s.chars().sorted().toArray();
        int[] sortedT = t.chars().sorted().toArray();
        for (int i=0; i<sortedS.length; i++){
            if (sortedS[i] != sortedT[i]) return false;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        if (s.length() <= 1) return true;
        int i = 0;
        int j = s.length() - 1;
        boolean res = false;
        while (i < j) {
            res = false;
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                if (i == j) return true;
            } else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                if (i == j) return true;
            } else if (Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))) {
                res = true;
                i++; j--;
            } else return false;
        }
        return res;
    }
}
