package other;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestInterviewTest {

    @Test
    void test() {
        List<Integer> left = List.of(0, 1, 2, 3);
        List<Integer> right = List.of(1,1,2,2);
        Iterator<Integer> actual = new TestInterview().mergeSortedIterators(left.iterator(), right.iterator());
        List<Integer> actualRes = new ArrayList<>();
        while (actual.hasNext()){
            actualRes.add(actual.next());
        }
        assertEquals(List.of(0, 1, 1, 1, 2, 2, 2, 3), actualRes);
    }
}