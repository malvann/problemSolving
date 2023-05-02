package leetcode;

import java.util.Arrays;

class MyHashSet {
    private int[] nums;
    private int nextIndex = 0;

    public MyHashSet() {
        this.nums = new int[10];
    }

    public int getSize() {
        return nextIndex;
    }

    public void add(int key) {
        if (nextIndex + 1 == nums.length) {
            nums = Arrays.copyOf(nums, nums.length * 2);
        }
        if (nextIndex == 0 || nums[nextIndex - 1] < key) nums[nextIndex++] = key;
        else {
            int insetIndex = findInsetIndex(key, 0, nextIndex - 1);
            if (nums[insetIndex] == key) return;

            nextIndex++;
            int buff;
            int val = key;
            for (int i = insetIndex; i < nextIndex; i++) {
                buff = nums[i];
                nums[i] = val;
                val = buff;
            }
        }
    }

    public void remove(int key) {
        int index = findIndex(key);
        if (index != -1) {
            for (int i = index; i < nextIndex; i++) {
                nums[i] = nums[i + 1];
            }
            nextIndex--;
        }
    }

    public boolean contains(int key) {
        return findIndex(key) != -1;
    }

    private int findInsetIndex(int key, int from, int to) {
        if (from == to) return nums[from] >= key ? from : ++from;

        int mid = from + (to - from) / 2;
        if (mid - 1 > -1 && nums[mid - 1] < key && nums[mid] >= key) return mid;
        return nums[mid] < key
                ? findInsetIndex(key, mid + 1, to)
                : findInsetIndex(key, from, mid);
    }

    private int findIndex(int key) {
        return nextIndex == 0
                ? -1
                : findIndex(key, 0, nextIndex - 1);
    }

    private int findIndex(int key, int from, int to) {
        if (nums[to] < key || (from == to && nums[to] != key)) return -1;

        int mid = from + (to - from) / 2;
        if (nums[mid] == key) return mid;
        return nums[mid] > key
                ? findIndex(key, from, mid)
                : findIndex(key, mid + 1, to);
    }
}
