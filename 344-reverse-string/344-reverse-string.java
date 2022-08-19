class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char curr = s[left];
            s[left] = s[right];
            s[right] = curr;
            right--;
            left++;
        }
    }
}