package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeInBetweenLinkedListsTest {
    @ParameterizedTest
    @MethodSource
    void test(ListNode list1, int a, int b, ListNode list2, ListNode result) {
        assertEquals(result, new MergeInBetweenLinkedLists().mergeInBetween(list1, a, b, list2));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(6, new ListNode(9, new ListNode(5, null)))))),
                        3, 4,
                        new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, null))),
                        new ListNode(10, new ListNode(1, new ListNode(13, new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(5, null)))))))
                ));
    }
}