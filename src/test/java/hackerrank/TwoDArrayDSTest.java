package hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoDArrayDSTest {
    @Test
    void test(){
        int max = TwoDArrayDS.hourglassSum(List.of(
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 1, 0, 0, 0, 0),
                List.of(1, 1, 1, 0, 0, 0),
                List.of(0, 0, 2, 4, 4, 0),
                List.of(0, 0, 0, 2, 0, 0),
                List.of(0, 0, 1, 2, 4, 0)
        ));
        assertEquals(19, max);
    }

}