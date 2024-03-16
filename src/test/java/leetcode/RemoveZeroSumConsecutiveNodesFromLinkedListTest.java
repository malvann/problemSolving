package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveZeroSumConsecutiveNodesFromLinkedListTest {
    @ParameterizedTest
    @MethodSource
    void test(ListNode node, String result) {
        assertEquals(result, new RemoveZeroSumConsecutiveNodesFromLinkedList().removeZeroSumSublists(node).toString());
    }

    private static Stream<Arguments> test() {
        return Stream.of(
//        Input: head = [1,2,-3,3,1]
//        Output: [3,1] or [1,2,1]
//
//        Input: head = [1,2,3,-3,4]
//        Output: [1,2,4]
//
//        Input: head = [1,2,3,-3,-2]
//        Output: [1]
                Arguments.of(new ListNode(5, new ListNode(-3, new ListNode(-4, new ListNode(1, new ListNode(6, new ListNode(-2, new ListNode(-5, null))))))), "5, -2, -5"),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(-3, new ListNode(3, new ListNode(1, null))))), "1, 2, 1"),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(4, null))))), "1, 2, 4"),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(-3, new ListNode(-2, null))))), "1")
        );
    }
}