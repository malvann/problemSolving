package leetcode;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (isEven(toDigitsNum(num))) counter++;
        }
        return counter;
    }

    private int toDigitsNum(int num) {
        int counter = 1;
        while ((num = num / 10) > 0) counter++;
        return ++counter;
    }

    private boolean isEven(int num) {
        return (num & 1) != 0;
    }
}
