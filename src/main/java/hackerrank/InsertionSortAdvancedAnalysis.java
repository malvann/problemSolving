package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortAdvancedAnalysis {
    private int shiftCount;
    private List<Integer> arr;
    private List<Integer> tempArr;

    public int insertionSort(List<Integer> arr) {
        this.arr = arr;
        this.tempArr = new ArrayList<>(arr);
        mergeSort(0, arr.size() - 1);
        return shiftCount;
    }

    private void mergeSort(int from, int to) {
        if (from >= to) return;

        int middle = (from + to) / 2;
        mergeSort(from, middle);
        mergeSort(middle + 1, to);
        merge(from, middle, to);
    }

    private void merge(int from, int middle, int to) {
        int i = from;
        int j = middle + 1;
        int k = from;
        while (i <= middle && j <= to) {
            if (tempArr.get(i) <= tempArr.get(j)) {
                arr.set(k, tempArr.get(i));
                i++;
            } else {
                arr.set(k, tempArr.get(j));
                shiftCount += middle - from - i;
                j++;
            }
            k++;
        }

        while (i <= middle) {
            arr.set(k, tempArr.get(i));
            ++k;
            ++i;
        }
        while (j <= middle) {
            arr.set(k, tempArr.get(j));
            ++k;
            ++j;
        }
    }
}
