package org.example;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head.next;
        ListNode prev = head;

        while (prev.next != null) {
            if (prev.val == curr.val) {
                curr = curr.next;
                prev.next = curr;
                continue;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}
