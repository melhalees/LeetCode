// Last updated: 11/28/2025, 4:57:23 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> stack = new Stack<>();
4
5        Set<String> operators = Set.of("+", "-", "*", "/");
6
7        for (String token : tokens) {
8            if (!operators.contains(token)) {
9                stack.push(Integer.parseInt(token));
10            } else {
11                int b = stack.pop();
12                int a = stack.pop();
13                int result = calc(a, b, token);
14                stack.push(result);
15            }
16        }
17
18        return stack.pop();
19    }
20
21    private int calc(int a, int b, String op) {
22        return switch (op) {
23            case "+" -> a + b;
24            case "-" -> a - b;
25            case "*" -> a * b;
26            default -> a / b;
27        };
28    }
29}
30