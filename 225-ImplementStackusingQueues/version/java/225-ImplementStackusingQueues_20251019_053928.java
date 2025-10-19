// Last updated: 10/19/2025, 5:39:28 AM
class MyStack {
    private Queue<Integer> queueIn;
    private Queue<Integer> queueOut;

    public MyStack() {
        queueIn = new LinkedList<>();
        queueOut = new LinkedList<>();
    }

    public void push(int x) {
        queueIn.offer(x);
    }

    public int pop() {
        while (queueIn.size() > 1) {
            queueOut.offer(queueIn.poll());
        }
        int top = queueIn.poll();
        swapQueues();
        return top;
    }

    public int top() {

        while (queueIn.size() > 1) {
            queueOut.offer(queueIn.poll());
        }

        int top = queueIn.peek();
        queueOut.offer(queueIn.poll());
        swapQueues();
        return top;
    }

    public boolean empty() {
        return queueIn.isEmpty();
    }

    private void swapQueues() {
        Queue<Integer> temp = queueIn;
        queueIn = queueOut;
        queueOut = temp;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */