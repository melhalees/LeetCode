// Last updated: 12/2/2025, 4:23:07 PM
1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int l = 1;
4        int r = Arrays.stream(piles).max().getAsInt();
5        int ans = r;
6
7        while (l <= r) {
8            int mid = l + (r - l) / 2;
9
10            if (canEatAllInKHours(piles, h, mid)) {
11                ans = mid;
12                r = mid - 1;
13            } else {
14                l = mid + 1;
15            }
16        }
17
18        return ans;
19    }
20
21    private boolean canEatAllInKHours(int[] piles, int h, int k) {
22        long hours = 0;
23
24        for (int pile : piles) {
25            hours += pile / k;
26            if (pile % k != 0) hours++;
27        }
28        return hours <= h;
29    }
30}