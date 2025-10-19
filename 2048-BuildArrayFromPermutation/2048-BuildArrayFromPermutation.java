// Last updated: 10/19/2025, 4:58:21 AM
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;

        // Putting old and new value in the same int.
        for(int i = 0; i < n; i++) {
            // int oldValue = nums[i];

            // New Value can be nums[nums[i]] only,
            // But wee make %, to avoid hitting
            // a place that holds the 2 value
            // and if it's not holding both value
            // it must be lower than n, so we will
            // get the old value in all cases.
            //              ||
            //              \/
            // int newValue = nums[nums[i]] % n;

            // nums[i] = oldValue + newValue * n;

            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }

        // Getting the new value 
        for(int i = 0; i < n; i++) {
            nums[i] /= n; 
        }

        return nums;
    }
}