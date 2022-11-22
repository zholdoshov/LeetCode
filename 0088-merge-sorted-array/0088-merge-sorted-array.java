class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m+n-1, indM = m-1, indN = n-1; indN >= 0; i--){
            if (indM >= 0 && nums1[indM] > nums2[indN]) nums1[i] = nums1[indM--];
            else nums1[i] = nums2[indN--];
        }
    }
}