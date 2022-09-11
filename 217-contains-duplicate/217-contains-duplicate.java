class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for (int num: nums) {
            if (set.contains(num)) {
                return true;
            } //if
            set.add(num);
        } //for
        
        return false;
    }
}