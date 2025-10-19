// Last updated: 10/19/2025, 6:35:16 AM
class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;

            queue.offer(i);

            while (!queue.isEmpty() && freq[s.charAt(queue.peek()) - 'a'] > 1) {
                queue.poll();
            }
        }

        return queue.isEmpty() ? -1 : queue.poll();
    }
}