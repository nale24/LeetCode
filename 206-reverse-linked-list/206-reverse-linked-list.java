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
    public ListNode reverseList(ListNode head) {
        ListNode temp = head, newNext = null;
        
        while (temp != null) {
            ListNode oldNext = temp.next;
            temp.next = newNext;
            newNext = temp;
            
            temp = oldNext;
        }
        return newNext;
    }
}