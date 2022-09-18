class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        for i in range(0, len(nums)):
            if nums[i] in map:
                return [min(i, map[nums[i]]), max(i, map[nums[i]])]
            else:
                map[target - nums[i]] = i
        return []