// Last updated: 12/2/2025, 2:31:07 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0, high = nums.length - 1;
4
5        while (low <= high) {
6            int mid = low + (high - low) / 2;
7
8            if (nums[mid] == target)
9                return mid;
10
11            if (nums[mid] < target)
12                low = mid + 1;
13
14            else
15                high = mid - 1;
16        }
17
18        return -1;
19    }
20}
21