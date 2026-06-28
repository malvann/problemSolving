package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {

    @Test
    void test() {
        DailyTemperatures target = new DailyTemperatures();
        assertArrayEquals(new int[]{1, 1, 1, 0}, target.dailyTemperatures(new int[]{30, 40, 50, 60}));
        assertArrayEquals(new int[]{1, 4, 1, 2, 1, 0, 0}, target.dailyTemperatures(new int[]{30, 38, 30, 36, 35, 40, 28}));
    }
}