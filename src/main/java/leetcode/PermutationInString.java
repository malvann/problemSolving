package leetcode;

public class PermutationInString {
    private int lastInd;
    private int[] target;

    public boolean checkInclusion(String s1, String s2) {
        int[] source = s2.chars().toArray();
        int i = -1;
        while (++i < s2.length() - s1.length() + 1) {
            int j = i - 1;
            target = s1.chars().toArray();
            lastInd = target.length - 1;
            while (j < source.length) {
                if (target[0] == -1) return true;
                if (!checkTarget(source[++j])) break;
            }
        }
        return false;
    }

    private boolean checkTarget(int currentSource) {
        for (int k = 0; k < target.length; k++) {
            if (target[k] == -1) break;
            if (target[k] == currentSource) {
                target[k] = target[lastInd];
                target[lastInd] = -1;
                lastInd--;
                return true;
            }
        }
        return false;
    }
}
