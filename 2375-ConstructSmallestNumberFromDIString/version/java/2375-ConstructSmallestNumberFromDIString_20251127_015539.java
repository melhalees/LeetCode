// Last updated: 11/27/2025, 1:55:39 AM
1class Solution {
2    public String smallestNumber(String pattern) {
3        int n = pattern.length();
4        StringBuilder result = new StringBuilder();
5        Stack<Integer> stack = new Stack<>();
6
7        for (int i = 0; i <= n; i++) {
8            stack.push(i + 1);
9
10            if (i == n || pattern.charAt(i) == 'I') {
11                while (!stack.isEmpty()) {
12                    result.append(stack.pop());
13                }
14            }
15        }
16
17        return result.toString();
18    }
19}