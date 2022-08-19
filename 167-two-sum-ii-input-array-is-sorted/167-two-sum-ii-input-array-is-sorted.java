class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(numbers[i])) {
                map.put(target - numbers[i], i);
            } //if
            else {
                int index1 = i, index2 = map.get(numbers[i]);
                return new int[]{Math.min(index1, index2) + 1, Math.max(index1, index2) + 1};
            }
        }
        return arr;
    }
}