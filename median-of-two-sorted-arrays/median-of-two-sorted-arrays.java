class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        
        if (m == 0 && n == 0) {
            return Integer.MIN_VALUE;
        }
        
        int[] arr = new int[m + n]; //merge 2 arrays into a new sorted array
        
        int i = 0, j = 0, k = 0; //index of nums1, nums2, and arr
        while (i < m && j < n) {
            arr[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        
        while (i < m) {
            arr[k++] = nums1[i++];
        }
        
        while (j < n) {
            arr[k++] = nums2[j++];
        }
        
        int temp = m + n; //holder to check the median in arr
        int midPoint = temp/2; 
        double median = temp % 2 == 0? (double)(arr[midPoint - 1] + arr[midPoint])/2 : arr[midPoint];
        return median;
        
    }
}