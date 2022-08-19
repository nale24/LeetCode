class Solution {
    public void moveZeroes(int[] nums) {
        
        for (int pos = 0, i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int num = nums[i];
                nums[i] = nums[pos];
                nums[pos++] = num;
            }
        }
    }
}