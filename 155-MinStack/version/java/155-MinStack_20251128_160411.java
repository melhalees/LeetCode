// Last updated: 11/28/2025, 4:04:11 PM
1class MinStack {
2
3    Stack<Integer> stack;
4    Stack<Integer> minValueSoFar;
5
6    public MinStack() {
7        stack = new Stack<>();
8        minValueSoFar = new Stack<>();
9    }
10
11    public void push(int val) {
12        stack.push(val);
13
14        if (minValueSoFar.isEmpty()) {
15            minValueSoFar.push(val);
16        } else {
17            if (val < minValueSoFar.peek()) {
18                minValueSoFar.push(val);
19            } else {
20                minValueSoFar.push(minValueSoFar.peek());
21            }
22        }
23    }
24
25    public void pop() {
26        minValueSoFar.pop();
27        stack.pop();
28    }
29
30    public int top() {
31        return stack.peek();
32    }
33
34    public int getMin() {
35        return minValueSoFar.peek();
36    }
37}
38