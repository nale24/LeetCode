class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long temp = num/2;
        
        while (temp * temp > num) {
            temp = (num/temp + temp)/2;
        }
        return temp * temp == num;
        
    }
}