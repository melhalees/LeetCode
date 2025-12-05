// Last updated: 12/6/2025, 2:37:10 AM
class Solution {
    public int countPartitions(int[] nums) {
        for(int j = 1; j < nums.length ; ++j){
            nums[j] += nums[j-1];
        }
        int sum = nums[nums.length - 1];

        int cnt = 0;
        for(int j = 0 ; j < nums.length - 1 ; ++j){
            int diff = sum - 2 * nums[j];
            if (diff % 2 == 0) {
                ++cnt;
            }
        }

        return cnt;
    }
}