// Last updated: 11/25/2025, 5:05:23 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int minimumOperations = 0;

        for (int num : nums) {
            int mod = num % 3;

            if (mod != 0) {
                minimumOperations++;
            }
        }

        return minimumOperations;
    }
}