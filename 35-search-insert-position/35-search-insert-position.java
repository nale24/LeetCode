class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1, pivot;
        while (l <= r) {
            pivot = l + (r - l)/2;
            if (target == nums[pivot]) {
                return pivot;
            }
            else if (target < nums[pivot]) {
                r = pivot - 1;
            }
            else {
                l = pivot + 1;
            }
        } //while
        return l;
    }
}