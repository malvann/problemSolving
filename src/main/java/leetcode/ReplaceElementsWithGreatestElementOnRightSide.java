package leetcode;

public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 0) return arr;

        int buf;
        int prev = -1;
        for (int i = arr.length - 2; i > -1; i--) {
            buf = arr[i];
            arr[i] = Math.max(prev, arr[i + 1]);
            prev = buf;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
