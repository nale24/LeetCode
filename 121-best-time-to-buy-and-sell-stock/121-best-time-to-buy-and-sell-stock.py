class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice = 2**32 - 1
        maxProfit = 0
        for p in prices:
            if p < minPrice:
                minPrice = p
            elif maxProfit < p - minPrice:
                maxProfit = p - minPrice
        return maxProfit