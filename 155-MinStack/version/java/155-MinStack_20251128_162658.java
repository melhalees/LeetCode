// Last updated: 11/28/2025, 4:26:58 PM
1class MinStack {
2
3    private static class StackItem {
4        int val;
5        int minValueSoFar;
6
7        StackItem(int val, int minValueSoFar) {
8            this.val = val;
9            this.minValueSoFar = minValueSoFar;
10        }
11    }
12
13    private Stack<StackItem> stack;
14
15    public MinStack() {
16        stack = new Stack<>();
17    }
18
19    public void push(int val) {
20        if (stack.isEmpty()) {
21            stack.push(new StackItem(val, val));
22        } else {
23            StackItem peek = stack.peek();
24            stack.push(new StackItem(val, Math.min(val, peek.minValueSoFar)));
25        }
26    }
27
28    public void pop() {
29        stack.pop();
30    }
31
32    public int top() {
33        StackItem peek = stack.peek();
34        return peek.val;
35    }
36
37    public int getMin() {
38       StackItem peek = stack.peek();
39        return peek.minValueSoFar;
40    }
41}
42