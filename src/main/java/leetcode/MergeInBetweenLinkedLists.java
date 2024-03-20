package leetcode;

import leetcode.util.ListNode;

public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode root = list1;

        b -= a;
        ListNode point1 = root;
        while (a-- > 1) point1 = point1.next;

        ListNode piont2 = point1.next;
        while (b-- > 0) piont2 = piont2.next;

        point1.next = list2;
        while (list2.next != null) list2 = list2.next;
        list2.next = piont2.next;

        return root;
    }
}
