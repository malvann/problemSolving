package leetcode;

import leetcode.util.ListNode;

public class MiddleOfEheLinkedList {
    public ListNode middleNode(ListNode head) {
        int counter = 0;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            counter++;
        }

        counter = ((counter & 1) != 0) ? counter / 2 + 1 : counter / 2;
        node = head;
        while (true) {
            if (counter == 0) return node;
            node = node.next;
            counter--;
        }
    }
}

