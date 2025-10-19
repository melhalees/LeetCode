// Last updated: 10/19/2025, 4:59:10 AM
class Solution {
    private int[] lps(String pattern) {
        int n = pattern.length();
        int[] result = new int[n];
        result[0] = 0;

        int i = 1;
        int len = 0;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                result[i] = ++len;
                i++;
            } else {
                if (len != 0) {
                    len = result[len - 1];
                } else {
                    result[i] = 0;
                    i++;
                }
            }
        }

        return result;
    }

    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if (n == 0) return 0;
        if (h < n) return -1;

        int[] lps = lps(needle);

        int i = 0;
        int j = 0;

        while (i < h) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == n) {
                    return i - j;
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }

        return -1;
    }
}