package leetcode;

import leetcode.util.ListNode;

import java.util.LinkedList;

public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode removeZeroSumSublists(ListNode head) {
        LinkedList<ListNode> queue = new LinkedList<>();
        queue.add(head);
        head = head.next;

//        5,-3,-4,1,6,-2,-5
        while (head != null) {
            if (queue.isEmpty()) queue.add(head);
            else if (head.val == 0) queue.peekLast().next = head.next;
            else if (head.val == queue.getLast().val * -1) {
                queue.removeLast();
                if (!queue.isEmpty()) queue.peekLast().next = head.next;
            } else if (isEdge(queue.peekLast(), head)) {
                int sum = queue.peekLast().val + head.val;
                // TODO
            } else queue.add(head);
            head = head.next;
        }

        return queue.stream().findFirst().orElse(null);
    }

    private boolean isEdge(ListNode a, ListNode b) {
        return (a.val > 0 && b.val < 0) || (a.val < 0 && b.val > 0);
    }
}
