package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {
    @Test
    void test() {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.pop();
        minStack.push(20);
        assertEquals(20, minStack.top());
        minStack.push(-20);
        assertEquals(-20, minStack.getMin());
    }
}