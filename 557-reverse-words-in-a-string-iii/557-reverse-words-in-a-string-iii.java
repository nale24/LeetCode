class Solution {
    public String reverseWords(String s) {
        int lastChar = -1, length = s.length();
        char[] stringChar = s.toCharArray();
        
        for (int i = 0; i <= length; i++) {
            if (i == length || stringChar[i] == ' ') {
                int wordStart = lastChar + 1, wordEnd = i - 1;
                reverseSingleWord(stringChar, wordStart, wordEnd);
                lastChar = i;
            }
        } //for
        return new String(stringChar);
    }
    
    private void reverseSingleWord(char[] chars, int start, int end) {
        while (start < end) {
            char thisChar = chars[start];
            chars[start] = chars[end];
            chars[end] = thisChar;
            start++;
            end--;
        }
    } //helper function to track and reverse a single word
}