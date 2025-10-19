// Last updated: 10/19/2025, 4:58:44 AM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1]; 
        }

        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            prefix[i] *= suffix;
            suffix *= nums[i];
        }

        return prefix;
    }
}