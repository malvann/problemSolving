package leetcode;

import leetcode.util.ListNode;

import java.util.LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        LinkedList<ListNode> pile = new LinkedList<>();
        ListNode node = head;
        while (node != null) {
            pile.addFirst(node);
            node = node.next;
        }

        pile.removeLast();
        while (pile.size() > 1) {
            head.next = pile.removeFirst();
            head = head.next;
            head.next = pile.removeLast();
            head = head.next;
        }
        if (!pile.isEmpty()) {
            head.next = pile.removeFirst();
            head = head.next;
        }
        head.next = null;
    }
}
