// Last updated: 11/28/2025, 4:17:11 PM
1class MinStack {
2
3    Stack<Long> stack;
4    long minValueSoFar;
5
6    public MinStack() {
7        stack = new Stack<>();
8    }
9
10    public void push(int val) {
11        if (stack.isEmpty()) {
12            minValueSoFar = val;
13            stack.push(0L);
14        } else {
15            long diff = val - minValueSoFar;
16            stack.push(diff);
17
18            if (diff < 0) {
19                minValueSoFar = val;
20            }
21        }
22    }
23
24    public void pop() {
25        long diff = stack.pop();
26
27        if (diff < 0) {
28            minValueSoFar = minValueSoFar - diff;
29        }
30    }
31
32    public int top() {
33        long diff = stack.peek();
34        if (diff >= 0) {
35            return (int)(minValueSoFar + diff);
36        } else {
37            return (int)minValueSoFar; 
38        }
39    }
40
41    public int getMin() {
42        return (int)minValueSoFar;
43    }
44}
45