// Last updated: 11/29/2025, 5:42:06 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int left = 0;
4        int right = height.length - 1;
5        int maxArea = 0;
6
7        while (left < right) {
8            int h = Math.min(height[left], height[right]);
9            int w = right - left;
10            maxArea = Math.max(maxArea, h * w);
11
12            // Move the smaller pointer
13            if (height[left] < height[right]) {
14                left++;
15            } else {
16                right--;
17            }
18        }
19
20        return maxArea;
21    }
22}
23