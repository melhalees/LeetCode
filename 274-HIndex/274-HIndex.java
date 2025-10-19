// Last updated: 10/19/2025, 4:58:43 AM
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];

        for (int c: citations) {
            if (c >= n) count[n]++;
            else count[c]++;
        }

        int csum = 0;
        for (int i = n; i >= 0; i--) {
            csum += count[i];

            if (csum >= i) return i;
        }

        return 0;
    }
}