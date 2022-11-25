class Solution:
    def fib(self, n: int) -> int:
        if n < 2:
            return n
        
        first = 0
        second = 1
        
        for i in range(1, n):
            temp = first
            first = second
            second = temp + second
            
        return second