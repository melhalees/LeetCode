// Last updated: 11/27/2025, 5:45:57 PM
1class Solution {
2    public List<String> buildArray(int[] target, int n) {
3        List<String> result = new ArrayList<>();
4        int index = 0;
5
6        for (int num = 1; num <= n && index < target.length; num++) {
7            result.add("Push");
8
9            if (num == target[index]) {
10                index++;
11            } else {
12                result.add("Pop");
13            }
14        }
15
16        return result;
17    }
18}