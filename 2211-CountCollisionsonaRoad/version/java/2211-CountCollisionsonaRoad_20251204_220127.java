// Last updated: 12/4/2025, 10:01:27 PM
1class Solution {
2    public int countCollisions(String directions) {
3        int n = directions.length();
4        int left = 0, right = n - 1;
5        int collisions = 0;
6
7        while (left < n && directions.charAt(left) == 'L') left++;
8
9        while (right >= 0 && directions.charAt(right) == 'R') right--;
10
11        for (int i = left; i <= right; i++) {
12            if (directions.charAt(i) != 'S') {
13                collisions++;
14            }
15        }
16
17        return collisions;
18    }
19}
20