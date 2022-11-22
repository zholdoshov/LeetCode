class Solution {
    public int searchInsert(int[] nums, int target) {
        int numsLength = nums.length;
        int low = 0;
        int high = nums.length -1;
        return binarySearch(nums, target, low, high);
    }
    
    public int binarySearch(int[] arr, int target, int low, int high) {
        if (high >= low) {
            int mid = low + (high-low) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                return binarySearch(arr, target, low, high-1);
            }
            else {
                return binarySearch(arr, target, mid+1, high);
            }
        }
        return low;
    }
}