// Last updated: 11/27/2025, 6:23:22 PM
1class CustomStack {
2    private int[] stack;
3    private int[] inc;
4    private int top;
5    private int maxSize;
6
7    public CustomStack(int maxSize) {
8        this.maxSize = maxSize;
9        stack = new int[maxSize];
10        inc = new int[maxSize];
11        top = -1;
12    }
13    
14    public void push(int x) {
15        if (top + 1 < maxSize) {
16            stack[++top] = x;
17        }
18    }
19    
20    public int pop() {
21        if (top == -1) return -1;
22
23        int res = stack[top] + inc[top];
24
25        if (top > 0) {
26            inc[top - 1] += inc[top];
27        }
28        inc[top] = 0;
29        top--;
30        return res;
31    }
32    
33    public void increment(int k, int val) {
34        int idx = Math.min(k - 1, top);
35        if (idx >= 0) {
36            inc[idx] += val;
37        }
38    }
39}
40
41
42/**
43 * Your CustomStack object will be instantiated and called as such:
44 * CustomStack obj = new CustomStack(maxSize);
45 * obj.push(x);
46 * int param_2 = obj.pop();
47 * obj.increment(k,val);
48 */