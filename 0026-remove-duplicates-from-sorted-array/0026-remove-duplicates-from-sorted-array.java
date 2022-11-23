class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;  // k is set to 0 as the unique element's index
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k+1] = nums[i];  // k+1 is a pointer to apply new unique element
                k++;  // every time when we detect unique element we increase unique element by 1
            }
        }
        return k+1;  // at the end it returns unique element's index + 1 as first k unique elemts
    }
}