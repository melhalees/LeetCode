// Last updated: 10/26/2025, 9:55:07 PM
class Solution {
    static class Node implements Comparable<Node> {
        int value;
        int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Node other) {
            if (this.value != other.value) {
                return this.value - other.value;
            }
            return this.index - other.index;
        }
    }
    
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add(new Node(nums[i], i));
        }

        for (int i = 0; i < k; i++) {
            Node min = pq.poll();
            min.value *= multiplier;
            pq.add(min);
        }

        int[] result = new int[nums.length];
        while (!pq.isEmpty()) {
            Node n = pq.poll();
            result[n.index] = n.value;
        }

        return result;
    }
}