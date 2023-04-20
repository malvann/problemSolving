package leetcode;

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int[] updated = new int[arr.length];
        int i = 0;
        int j = 0;
        while (j < updated.length) {
            updated[j] = arr[i];
            if (arr[i] == 0 && j + 1 < updated.length) updated[++j] = arr[i];
            j++;
            i++;

            arr[i - 1] = updated[i - 1];
        }

        while (i < updated.length) {
            arr[i] = updated[i++];
        }
    }
}
