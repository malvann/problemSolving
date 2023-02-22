package streams;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountOnlyDuplicatesTest {
    @Test
    void test() {
        assertEquals(Map.of("a", 2L, "f", 3L), new CountOnlyDuplicates().countOnlyDuplicates(List.of("a", "a", "f", "g", "r", "f", "f")));
    }
}