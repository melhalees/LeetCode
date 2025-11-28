// Last updated: 11/28/2025, 6:02:09 PM
1class Solution {
2
3    public int[] dailyTemperatures(int[] temperatures) {
4        int n = temperatures.length;
5        if (n == 1) return new int[] {0};
6
7        int[] answer = new int[n];
8        Arrays.fill(answer, 0);
9    
10        Stack<Integer> tempIndexStack = new Stack<>();
11        tempIndexStack.push(0);
12
13        for (int i = 1; i < n; i++) {
14
15            while (!tempIndexStack.isEmpty() && temperatures[i] > temperatures[tempIndexStack.peek()]) {
16                int pop = tempIndexStack.pop();
17                answer[pop] = i - pop;
18            }
19
20            tempIndexStack.push(i);
21        }
22
23        return answer;
24    }
25}
26