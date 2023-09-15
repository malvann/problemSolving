package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(ListNode head, int k, ListNode result) {
        assertEquals(result.toString(), new RotateList().rotateRight(head, k).toString());
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),
                        2,
                        new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3, null)))))),
                Arguments.of(
                        new ListNode(0, new ListNode(1, new ListNode(2, null))),
                        4,
                        new ListNode(2, new ListNode(0, new ListNode(1, null)))),
                Arguments.of(
                        new ListNode(1, new ListNode(2, null)),
                        1,
                        new ListNode(2, new ListNode(1, null)))
        );
    }
}