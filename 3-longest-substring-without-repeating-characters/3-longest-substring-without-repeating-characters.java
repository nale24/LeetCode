class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        } //if
        
        int count = 0, currMax = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            } //if
            currMax = Math.max(currMax, i - j + 1);
            map.put(s.charAt(i), i + 1);
        } //for
        
        return currMax;
    }
}