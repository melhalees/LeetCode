// Last updated: 12/3/2025, 10:22:27 PM
1class Solution {
2    public boolean isHappy(int n) {
3        Set<Integer> history = new HashSet<>();
4
5        while (n != 1) {
6            if (history.contains(n)) { 
7                return false;
8            }
9            history.add(n);
10
11            n = sumSquareOfDigits(n);
12        }
13
14        return true;
15    }
16
17    private int sumSquareOfDigits(int n) {
18        int sum = 0;
19
20        while (n != 0) {
21            int digit = n % 10;
22            sum += digit * digit;
23            n /= 10;
24        }
25
26        return sum;
27    }
28}
29