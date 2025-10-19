// Last updated: 10/19/2025, 4:59:04 AM
class Solution {
    public int climbStairs(int n) {
        int one = 1;
        int two = 1;
        int tmp;

        for (int i = 0; i < n - 1; i++) {
            tmp = one;
            one += two;
            two = tmp;
        }

        return one;
    }
}
