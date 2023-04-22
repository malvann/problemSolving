package leetcode;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        boolean topIsReached = false;
        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] || topIsReached && arr[i] > arr[i - 1]
                    || (arr[i] < arr[i - 1] && i == 1)) return false;
            if (!topIsReached && arr[i] < arr[i - 1]) topIsReached = true;
        }
        return topIsReached;
    }
}
