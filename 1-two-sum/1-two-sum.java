class Solution {
    public int[] twoSum(int[] nums, int target) {
        // if the array length is less than 2, we don't have enough 2 indices to return
        if (nums.length < 2) {
            return null;
        }
        
        //this map holds the numbers that add to the target and their indices
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{Math.min(i, map.get(nums[i])), Math.max(i, map.get(nums[i]))};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{}; //cannot find any pairs
    }
}