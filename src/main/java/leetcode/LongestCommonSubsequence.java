package leetcode;

public class LongestCommonSubsequence {
    int[][] mat;
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1.length() == 0 || text2.length() == 0) return 0;

        mat = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                mat[i][j] = text1.charAt(i - 1) == text2.charAt(j - 1)
                        ? mat[i - 1][j - 1] + 1
                        : Math.max(mat[i - 1][j], mat[i][j - 1]);
            }
        }
        return mat[mat.length - 1][mat[0].length - 1];
    }
}
