class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_subarray = nums[0]
        temp_max_subarray = nums[0]
        
        for i in range(1, len(nums)):
            curr_subarray = max(nums[i], nums[i] + curr_subarray)
            temp_max_subarray = max(temp_max_subarray, curr_subarray)
            
        return temp_max_subarray
            