// Last updated: 10/26/2025, 9:56:32 PM
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }

        for (int i = 0; i < k; i++) {
            int[] min = pq.poll();
            min[0] *= multiplier;
            pq.add(min);
        }

        int[] result = new int[nums.length];
        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            result[pair[1]] = pair[0];
        }

        return result;
    }
}