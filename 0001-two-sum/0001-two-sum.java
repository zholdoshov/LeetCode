class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pair = target - nums[i];
            if (indexes.containsKey(pair)) {
                return new int[]{indexes.get(pair), i};
            }
            indexes.put(nums[i], i);
        }
        return new int[]{};
    }
}