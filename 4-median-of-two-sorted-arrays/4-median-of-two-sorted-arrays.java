class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length, i= 0, j = 0, k = 0;
        
        double[] nums = new double[l1+ l2];
        
        while (i < l1 && j < l2) {
            nums[k++] = nums1[i] > nums2[j] ? nums2[j++] : nums1[i++];
        } //while
        
        while (i < l1) {
            nums[k++] = nums1[i++];
        }
        
        while (j < l2) {
            nums[k++] = nums2[j++];
        }
        
        int mid = (l1 + l2)/2;
        if ((l1 + l2) % 2 == 1) {
            return nums[mid];
        }
        else {
            return (nums[mid - 1] + nums[mid])/2;
        }
        
    }
}