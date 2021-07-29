/*
  Runtime: 2 ms, faster than 64.80% of Java online submissions for Add Two Numbers.
  Memory Usage: 39 MB, less than 87.15% of Java online submissions for Add Two Numbers.
/*

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode previousNode = null;
        byte carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + carry;
            carry = 0;

            if (sum >= 10) {
                sum %= 10;
                carry = 1;
            }
            
            if (head == null) {
                head = new ListNode(sum);
                previousNode = head;
            } else {
                previousNode.next = new ListNode(sum);
                previousNode = previousNode.next;
            }
            
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        
        return head;
    }
}
