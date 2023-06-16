package leetcode;

import leetcode.util.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLinkedListIITest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(ListNode head, int from, int to, ListNode result) {
        assertEquals(result.toString(), new ReverseLinkedListII().reverseBetween(head, from, to).toString());
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),
                        2, 4,
                        new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, null)))))),
                Arguments.of(new ListNode(5, null), 1, 1, new ListNode(5, null)),
                Arguments.of(new ListNode(3, new ListNode(5, null)), 1, 1, new ListNode(3, new ListNode(5, null))),
                Arguments.of(new ListNode(3, new ListNode(5, null)), 1, 2, new ListNode(5, new ListNode(3, null))),
                Arguments.of(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null))))),
                        3, 4,
                        new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(3, new ListNode(5, null))))))
        );
    }
}
