package hackerrank;

public class FindDigits {
    public static int findDigits(int n) {
        int counter = 0;
        int target = n;
        while (target > 0) {
            if (target % 10 != 0 && n % (target % 10) == 0)  counter++;
            target = (target - target % 10) / 10;
        }
        return counter;
    }

}
