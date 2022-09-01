class Solution {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int first = 0, second = 1;
        for (int i = 0; i < n; i++) {
            int temp = first;
            first = first + second;
            second = temp;
        } //for
        return first;
    }
}