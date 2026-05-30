package other;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TopKFrequentElementsTest {

    @Test
    void test() {
        int[] res = new TopKFrequentElements().topKFrequent(new int[]{1, 2, 2, 3, 3, 3}, 2);
        assertEquals("2,3", IntStream.of(res).mapToObj(String::valueOf).collect(Collectors.joining(",")));
    }
}