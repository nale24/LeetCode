class Solution:
    def countPrimes(self, n: int) -> int:
        if n <= 2:
            return 0
        
        isPrime = [False, False] + [True]*(n - 2)
        for i in range(2, int(sqrt(n)) + 1):
            if isPrime[i]:
                isPrime[i*i : n : i] = [False] * math.ceil(n/i - i)
                
        return sum(isPrime)
    