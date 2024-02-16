package hackerrank;

import java.util.List;

public class BillDivision {
    public static String bonAppetit(List<Integer> bill, int k, int b) {
        int total = bill.stream().parallel()
                .reduce(Integer::sum)
                .orElse(0) - bill.get(k);
        return total / 2 == b ? "Bon Appetit" : String.valueOf(b - total / 2);
    }
}