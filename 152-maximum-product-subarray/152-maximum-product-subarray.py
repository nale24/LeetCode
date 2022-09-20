class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        
        currMax = -2**31
        prod = 1
        
        for num in nums:
            prod *= num;
            currMax = max(prod, currMax)
            if prod == 0:
                prod = 1
                
        prod = 1
        for i in reversed(range(len(nums))):
            prod *= nums[i]
            currMax = max(prod, currMax)
            if prod == 0:
                prod = 1
            
        return currMax;