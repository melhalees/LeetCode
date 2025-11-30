// Last updated: 11/30/2025, 5:42:17 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin = 0;
        int end = 0;
        int maxLength = 0;

        Map<Character, Integer> map = new HashMap<>();

        while (end < s.length()) {
            char currChar = s.charAt(end);
            int lastSeenIdx = map.getOrDefault(currChar, -1);

            if (lastSeenIdx >= begin) begin = lastSeenIdx + 1;

            maxLength = Math.max(maxLength, end - begin + 1);

            map.put(currChar, end);
            end++;
        }

        return maxLength;
    }
}