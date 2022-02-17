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
        ListNode node = new ListNode(), curr = node;
        int carry = 0; 
        
        while (l1 != null || l2 != null) {
            //there's info left to read
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            
            int num = num1 + num2 + carry;
            carry = num /10;
            
            curr.next = new ListNode(num % 10);
            curr = curr.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        } //while
        if (carry != 0) {
            curr.next = new ListNode(carry);
        }
        
        return node.next;
        
    }
}