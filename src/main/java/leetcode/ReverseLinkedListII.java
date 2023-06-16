package leetcode;

import leetcode.util.ListNode;

public class ReverseLinkedListII {
    ListNode postRightNode;

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || head.next == null || right - left == 0) return head;

        ListNode preLeftNode;
        ListNode leftNode;
        ListNode rightNode;

        // left is head
        if (left == 1) {
            rightNode = head;
            leftNode = reverse(head, right - left);
            rightNode.next = postRightNode;
            return leftNode;
        }

        // common situation
        preLeftNode = head;
        int iter = left;
        while (iter-- > 2) preLeftNode = preLeftNode.next;
        rightNode = preLeftNode.next;
        leftNode = reverse(rightNode, right - left);

        preLeftNode.next = leftNode;
        rightNode.next = postRightNode;

        return head;
    }

    private ListNode reverse(ListNode head, int delta) {
        ListNode prev = null;

        ListNode tmp = null;
        while (delta-- > -1) {
            tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        postRightNode = tmp;
        return prev;
    }
}
