// Last updated: 12/4/2025, 9:48:53 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int left = 0, right = n - 1;
5        int collisions = 0;
6
7        while (left < n && directions.charAt(left) == 'L') {
8            left++;
9        }
10
11        while (right >= 0 && directions.charAt(right) == 'R') {
12            right--;
13        }
14
15        for (int i = left; i <= right; i++) {
16            if (directions.charAt(i) != 'S') {
17                collisions++;
18            }
19        }
20
21        return collisions;
22    }
23}
24