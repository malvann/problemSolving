package leetcode;

import leetcode.util.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int i) {
        if (head == null || head.next == null || i == 0) return head;

        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            size++;
            temp = temp.next;
        }
        temp.next = head;
        i = i % size;
        i = size - i;
        while (i-- != 0) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}
