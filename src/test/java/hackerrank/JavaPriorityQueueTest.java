package hackerrank;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaPriorityQueueTest {
    @Test
    void empryTest() {
        List<String> events = List.of(
                "ENTER Bidhan 3.75 50",
                "ENTER Rijul 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ratul 3.9 42",
                "ENTER Tanvir 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Nisha 3.95 50",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED",
                "SERVED"
        );
        assertTrue(new Priorities().getStudents(events).isEmpty());
    }

    @Test
    void test() {
        List<String> students = new Priorities().getStudents(List.of(
                "ENTER John 3.75 50",
                "ENTER Mark 3.8 24",
                "ENTER Shafaet 3.7 35",
                "SERVED",
                "SERVED",
                "ENTER Samiha 3.85 36",
                "SERVED",
                "ENTER Ashley 3.9 42",
                "ENTER Maria 3.6 46",
                "ENTER Anik 3.95 49",
                "ENTER Dan 3.95 50",
                "SERVED"));
        assertEquals(List.of(
                "Dan",
                "Ashley",
                "Shafaet",
                "Maria"), students);
    }
}