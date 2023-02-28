package leetcode;


import leetcode.util.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode node = head;
        while (node.next != null) {
            node = node.next;
            size++;
        }

        int counter = size - n;
        node = head;
        ListNode edited = null;
        while (node.next != null) {
            if (counter == 1) edited = node;
            if (counter == -1) {
                assert edited != null;
                edited.next = node;
            }
            node = node.next;
            counter--;
        }
        return head;
    }
}
