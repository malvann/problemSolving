package leetcode.util;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public String toString() {
        return this.val + (this.next == null ? "" : ", " + this.next);
    }
}
