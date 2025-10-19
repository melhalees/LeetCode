// Last updated: 10/19/2025, 4:58:25 AM
import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = prices.clone();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int idx = stack.pop();
                result[idx] = prices[idx] - prices[i];
            }
            stack.push(i);
        }

        return result;
    }
}
