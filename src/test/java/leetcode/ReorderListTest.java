package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReorderListTest {
    @ParameterizedTest
    @MethodSource
    void test(ListNode head, ListNode result) {
        new ReorderList().reorderList(head);
        assertEquals(result, head);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null)))),
                        new ListNode(1, new ListNode(4, new ListNode(2, new ListNode(3, null))))),
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),
                        new ListNode(1, new ListNode(5, new ListNode(2, new ListNode(4, new ListNode(3, null))))))
        );
    }
}