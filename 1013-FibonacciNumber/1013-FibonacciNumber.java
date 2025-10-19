// Last updated: 10/19/2025, 4:58:29 AM
class Solution {
    public int fib(int n) {
        if (n < 2) return n;

        int prev2 = 0;
        int prev1 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }
}
