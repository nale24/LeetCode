class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if len(digits) == 0:
            return [1]
        
        result = []
        num = 1 + digits[-1]
        carry = num // 10
        
        result.append(num % 10)
        
        for i in range(2, len(digits) + 1):
            num = carry + digits[-i]
            
            result.insert(0, num % 10)
            
            carry = num //10
            
        if carry != 0:
            result.insert(0, carry)
            
        return result