class Solution:
    def myAtoi(self, s: str) -> int:
        MAX_INT = 2**31 - 1
        MIN_INT = -2**31
        
        sign = 1
        num = 0
        i = 0
        
        while i < len(s) and s[i] == ' ':
            i += 1
            
        if i < len(s) and s[i] == '+':
            sign = 1
            i += 1
        elif i < len(s) and s[i] == '-':
            sign = -1
            i += 1
        
        while i < len(s) and s[i].isdigit():
            digit = int(s[i])
            if ((num > MAX_INT//10) or (num == MAX_INT//10 and digit > MAX_INT % 10)):
                return MAX_INT if sign == 1 else MIN_INT
            
            num = num * 10 + digit
            i += 1
            
        return sign*num
            
        
        return 0