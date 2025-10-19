// Last updated: 10/19/2025, 4:58:19 AM
class Solution {
    public int subsetXORSum(int[] nums) {
        int orVal = 0;
        for (int num : nums) {
            orVal |= num;
        }

        int n = nums.length;
        return orVal * (1 << (n - 1));
    }
}