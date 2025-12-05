// Last updated: 12/6/2025, 2:43:43 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        return (Arrays.stream(nums).sum() & 1) == 1 ? 0 : nums.length - 1;
4    }
5}
6