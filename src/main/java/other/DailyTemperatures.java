package other;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length < 2) return new int[]{0};
        for (int i = 0; i < temperatures.length; i++) {
            for (int j = i + 1; j < temperatures.length; j++) {
                if (temperatures[j] > temperatures[i]) {
                    temperatures[i] = j - i;
                    break;
                } else if (j == temperatures.length - 1) temperatures[i] = 0;
            }
        }
        temperatures[temperatures.length - 1] = 0;
        return temperatures;
    }
}
