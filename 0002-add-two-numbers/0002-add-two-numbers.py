# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        l3 = ListNode(0)
        node = l3
        carry = 0
        
        while l1 != None or l2 != None:
            num1 = l1.val if l1 != None else 0
            num2 = l2.val if l2 != None else 0
            total = num1 + num2 + carry
            carry = total // 10
            l3.next = ListNode(total % 10)
            l3 = l3.next 
            
            if l1 != None:
                l1 = l1.next
            
            if l2 != None:
                l2 = l2.next 
        
        if carry != 0:
            l3.next = ListNode(carry)
            
        return node.next
            