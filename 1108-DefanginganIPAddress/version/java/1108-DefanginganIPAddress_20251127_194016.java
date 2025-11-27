// Last updated: 11/27/2025, 7:40:16 PM
1class Solution {
2    public String defangIPaddr(String address) {
3        StringBuilder res = new StringBuilder();
4
5        for (char c : address.toCharArray()) {
6            if (c != '.') {
7                res.append(c);
8            } else {
9                res.append("[.]");
10            }
11        }
12
13        return res.toString();
14    }
15}