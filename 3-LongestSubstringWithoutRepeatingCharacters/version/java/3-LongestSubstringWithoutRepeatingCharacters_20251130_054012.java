// Last updated: 11/30/2025, 5:40:12 AM
1public class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int res = 0;
4        for (int i = 0; i < s.length(); i++) {
5
6            Set<Character> set = new HashSet<>();
7
8            for (int j = i; j < s.length(); j++) {
9                if (set.contains(s.charAt(j))) {
10                    break;
11                }
12                set.add(s.charAt(j));
13            }
14            res = Math.max(res, set.size());
15        }
16        return res;
17    }
18}