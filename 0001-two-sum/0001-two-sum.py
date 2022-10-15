class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numDict = dict()
        
        for i in range(len(nums)):
            number = target - nums[i]
            
            if number in numDict:
                return [min(i, numDict[number]), max(i, numDict[number])]
            else:
                numDict[nums[i]] = i
        
        return []