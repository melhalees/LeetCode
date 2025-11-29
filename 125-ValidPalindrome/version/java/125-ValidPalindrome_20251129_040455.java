// Last updated: 11/29/2025, 4:04:55 AM
1class Solution {
2    public boolean isPalindrome(String s) {
3        int n = s.length();
4
5        if (n == 1) {
6            return true;
7        }
8
9        int i = 0;
10        int j = n - 1;
11
12        while (i < j) {
13            if (!Character.isLetterOrDigit(s.charAt(i))) {
14                i++;
15                continue;
16            }
17
18            if (!Character.isLetterOrDigit(s.charAt(j))) {
19                j--;
20                continue;
21            }
22
23            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
24                return false;
25            }
26
27            i++;
28            j--;
29        }
30
31        return true;
32    }
33}
34