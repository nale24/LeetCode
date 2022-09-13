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
        int num1 = 0, num2 = 0, carry = 0;
        
        ListNode node = new ListNode(), dummy = node;
        
        while (l1 != null || l2 != null || carry != 0) {
            num1 = l1 == null ? 0 : l1.val;
            num2 = l2 == null ? 0 : l2.val;
            
            int num = num1 + num2 + carry;
            carry = num / 10;
            
            node.next = new ListNode(num % 10);
            node = node.next;
            
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        
        if (carry != 0) {
            node.next = new ListNode(carry);
        }
        
        return dummy.next;
    }
}