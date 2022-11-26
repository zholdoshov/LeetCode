class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        
        for (int num : nums) {
            x ^= num;
        }
        return x;
    }
}

// Here I have used bitwise operator exclusive or (XOR)
// Example: int x = 0,nums =  [2,1,2] --> 0 ^ 2 = 2; 2 ^ 1 = 3; 3 ^ 2 = 1