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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode prev = head, temp = head;
        int i = 0, len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        if (len == n) {
            return head.next;
        }
        
        while (i < (len - n - 1)) {
            if (prev != null) {
                prev = prev.next;
            }
            i++;
        }
        if (prev != null) {
            prev.next = prev.next.next;
        }
        return head;
        
    }
}