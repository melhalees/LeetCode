// Last updated: 10/19/2025, 4:58:11 AM
class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int result = 0;

        for (int num : nums) {
            int count = freq.get(num);
            if (count % k == 0) {
                result += num;
            }
        }

        return result;
    }
}