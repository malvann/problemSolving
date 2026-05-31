package other;

public class ProductsOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < res.length; j++) {
                if (i == 0) res[j] = -21;
                if (i == j) continue;
                res[j] = res[j] == -21 ? nums[i] : res[j] * nums[i];
            }
        }
        return res;
    }
}