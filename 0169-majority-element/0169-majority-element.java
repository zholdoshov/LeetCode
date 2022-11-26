class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// First, it sorts and returns the index of the mid element because most elements appear more than [arr.length/2]