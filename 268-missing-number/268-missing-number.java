class Solution {
    public int missingNumber(int[] nums) {
        int actualSum = 0, expectedSum = 0;
        
        expectedSum = (nums.length + 1)*nums.length/2;
        for (int num:nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}