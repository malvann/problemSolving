package leetcode;

import java.util.stream.IntStream;

public class SwapAdjacentInLRString {
    private static final int X = 'X';
    private static final int R = 'R';
    private static final int L = 'L';
    private char[] startCharArr;
    private char[] endCharArr;

    public boolean canTransform(String start, String end) {
        startCharArr = start.toCharArray();
        endCharArr = end.toCharArray();
        return IntStream.range(0, start.length()).boxed().allMatch(this::canTransform);
    }

    private boolean canTransform(int currInd) {
        if (startCharArr[currInd] == endCharArr[currInd]) return true;
        if (currInd == startCharArr.length - 1) return false;
        if (isSwappable(startCharArr[currInd], startCharArr[currInd + 1])
                && startCharArr[currInd + 1] == endCharArr[currInd]) {
            swap(currInd, currInd + 1);
            return true;
        }
        //L-case
        if (multiswapCase(currInd, L, X)) return true;
        //R-case
        return multiswapCase(currInd, X, R);
    }

    private boolean multiswapCase(int currInd, int ch1, int ch2){
        if (endCharArr[currInd] == ch1 && startCharArr[currInd] == ch2 && startCharArr[currInd + 1] == ch2) {
            int ind = currInd;
            while (startCharArr[ind] == ch2 && ind != startCharArr.length - 1) {
                ind++;
            }
            if (startCharArr[ind] == ch1) {
                swap(currInd, ind);
                return true;
            }
        }
        return false;
    }

    private boolean isSwappable(int current, int next) {
        return (current == R && next == X) || (current == X && next == L);
    }

    private void swap(int i, int y) {
        char ch = startCharArr[i];
        startCharArr[i] = startCharArr[y];
        startCharArr[y] = ch;
    }
}