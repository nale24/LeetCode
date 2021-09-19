class Solution {
    public int reverse(int x) {
        int reversed = 0;
        int temp = x; //temporary holder for x value
        while (temp != 0) {   
            int digit = temp % 10;
            temp /= 10;
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; //check boundaries
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; //check boundaries
            }
            
            reversed = reversed * 10 + digit;
        } //while
        return reversed;
    }
}