package org.example;

public class Main {
    public static void main(String[] args) {
        ListNode fifth = new ListNode(3);
        ListNode fourth = new ListNode(3, fifth);
        ListNode third = new ListNode(2, fourth);
        ListNode second = new ListNode(1, third);
        ListNode head = new ListNode(1, second);

        Solution solution = new Solution();

        solution.deleteDuplicates(head);
    }
}