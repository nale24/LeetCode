class Solution {
    public int search(int[] nums, int target) {
        if (nums.length < 1) {
            return -1;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left <= right) {    
            mid = left + (right - left)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            
        } //while
        
        return -1;
        
    }
}