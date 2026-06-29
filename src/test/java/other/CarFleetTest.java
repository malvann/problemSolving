package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarFleetTest {

    @Test
    void test() {
        CarFleet target = new CarFleet();
        assertEquals(2, target.carFleet(10, new int[]{6, 8}, new int[]{3, 2}));
        assertEquals(1, target.carFleet(10, new int[]{1, 4}, new int[]{3, 2}));
        assertEquals(3, target.carFleet(10, new int[]{4, 1, 0, 7}, new int[]{2, 2, 1, 1}));
    }
}