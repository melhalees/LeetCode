// Last updated: 10/21/2025, 4:02:50 AM
class Solution {
    public int minLength(String s) {
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (
                queue.size() != 0 &&
                ((s.charAt(i) == 'B' && queue.peekLast() == 'A') ||
                s.charAt(i) == 'D' && queue.peekLast() == 'C')
            ) queue.removeLast();
            else queue.offer(s.charAt(i));
        }

        return queue.size();
    }
}