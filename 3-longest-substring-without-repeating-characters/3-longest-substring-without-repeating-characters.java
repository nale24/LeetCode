class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = 0, stringLen = s.length();
        Map<Character, Integer> map = new HashMap<>();
        
        for (int i = 0, j = 0; i < stringLen; i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            len = Math.max(len, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return len;
        
    }
}