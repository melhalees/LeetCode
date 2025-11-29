// Last updated: 11/29/2025, 5:31:04 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> result = new ArrayList<>();
5
6        for (int i = 0; i < nums.length - 2; i++) {
7            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates
8
9            int left = i + 1;
10            int right = nums.length - 1;
11
12            while (left < right) {
13                int sum = nums[i] + nums[left] + nums[right];
14
15                if (sum == 0) {
16                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
17                    left++;
18                    right--;
19
20                    // skip duplicates
21                    while (left < right && nums[left] == nums[left - 1]) left++;
22                    while (left < right && nums[right] == nums[right + 1]) right--;
23
24                } else if (sum < 0) {
25                    left++;
26                } else {
27                    right--;
28                }
29            }
30        }
31
32        return result;
33    }
34}
35