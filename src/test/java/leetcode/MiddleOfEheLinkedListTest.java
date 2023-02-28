package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfEheLinkedListTest {
    @Test
    void test() {
        ListNode previous = null;
        for (int num : List.of(6, 5, 4, 3, 2, 1)) {
            previous = new ListNode(num, previous);
        }
        assertEquals(4, new MiddleOfEheLinkedList().middleNode(previous).val);
    }
}