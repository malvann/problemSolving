package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveNthNodeFromEndOfListTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> source, int k, List<Integer> result) {
        ListNode node = null;
        for (int num : source) {
            node = new ListNode(num, node);
        }
        node = new RemoveNthNodeFromEndOfList().removeNthFromEnd(node, 2);
        List<Integer> nums = new ArrayList<>();
        while (node.next != null) {
            nums.add(node.val);
            node = node.next;
        }

        assertEquals(result, nums);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(List.of(6, 5, 4, 3, 2, 1), 2, List.of(1, 2, 3, 5)),
                Arguments.of(List.of(2, 1), 1, List.of(1)),
                Arguments.of(List.of(1), 1, List.of()));
    }
}