// Last updated: 12/8/2025, 3:59:38 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        for (int i = 0; i < nums.length; i++) {
4            int index = Math.abs(nums[i]) - 1;
5            if (nums[index] > 0) nums[index] = -nums[index];
6        }
7        
8        List<Integer> result = new ArrayList<>();
9        for (int i = 0; i < nums.length; i++) {
10            if (nums[i] > 0) result.add(i + 1);
11        }
12        
13        return result;
14    }
15}
16