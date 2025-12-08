// Last updated: 12/8/2025, 3:48:26 PM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3        int[] count = new int[101];
4        
5        for (int x : nums) {
6            count[x]++;
7        }
8        
9        for (int i = 1; i < 101; i++) {
10            count[i] += count[i - 1];
11        }
12        
13        int[] result = new int[nums.length];
14        for (int i = 0; i < nums.length; i++) {
15            int x = nums[i];
16            result[i] = x == 0 ? 0 : count[x - 1];
17        }
18        
19        return result;
20    }
21}
22