// Last updated: 10/19/2025, 4:58:12 AM
class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int maxEnergy = Integer.MIN_VALUE;

        for (int start = n - 1; start >= n - k; start--) {
            int sum = 0;
            for (int i = start; i >= 0; i -= k) {
                sum += energy[i];
                maxEnergy = Math.max(maxEnergy, sum);
            }
        }

        return maxEnergy;
    }
}
