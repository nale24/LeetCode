class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        
        MAX_NUM = pow(2,31) - 1
        reverse = 0
        
        temp = x
        while temp != 0:
            digit = temp % 10
            
            if reverse > MAX_NUM or (reverse == MAX_NUM % 10 and digit > MAX_NUM % 10):
                reverse = MAX_NUM
            
            
            reverse = reverse * 10 + digit
            temp = temp //10
            
        
        return x == reverse