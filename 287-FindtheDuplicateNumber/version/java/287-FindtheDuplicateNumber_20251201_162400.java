// Last updated: 12/1/2025, 4:24:00 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[nums[0]];
5
6        while (slow != fast) {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9        }
10
11        fast = 0;
12
13        while (slow != fast) {
14            slow = nums[slow];
15            fast = nums[fast];
16        }
17
18        return slow;
19    }
20}
21