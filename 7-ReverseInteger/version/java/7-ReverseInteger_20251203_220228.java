// Last updated: 12/3/2025, 10:02:28 PM
1class Solution {
2    public int reverse(int x) {
3        int rev = 0;
4        
5        while (x != 0) {
6            int digit = x % 10;
7            x /= 10;
8
9            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
10                return 0;
11            }
12            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
13                return 0;
14            }
15
16            rev = rev * 10 + digit;
17        }
18
19        return rev;
20    }
21}
22