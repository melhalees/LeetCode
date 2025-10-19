// Last updated: 10/19/2025, 4:58:08 AM
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;

        for (int start = 0; start < n; start++) {
            int[] freq = new int[26];
            
            for (int end = start; end < n; end++) {
                freq[s.charAt(end) - 'a']++;

                if (isBalanced(freq)) {
                    ans = Math.max(ans, end - start + 1);
                }
            }
        }

        return ans;
    }

    private boolean isBalanced(int[] freq) {
        int common = 0;

        for (int f : freq) {
            if (f == 0) continue;
            if (common == 0) common = f;
            else if (common != f) return false;
        }

        return true;
    }
}