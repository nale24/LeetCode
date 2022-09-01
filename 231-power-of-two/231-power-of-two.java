class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        long num = (long)(n);
        
        return (num & (-num)) == num;
    }
}