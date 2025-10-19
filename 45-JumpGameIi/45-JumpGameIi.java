// Last updated: 10/19/2025, 4:59:07 AM
class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0;

        int maxReach = 0;
        int end = 0;
        int jumps = 0;

        for(int i = 0; i < n; i++) {
            maxReach = Math.max(maxReach, i + nums[i]);

            if (maxReach >= n - 1) {
                return jumps + 1;
            }

            if (i == end) {
                jumps++;
                end = maxReach;
            }
        }

        return jumps;
    }
}