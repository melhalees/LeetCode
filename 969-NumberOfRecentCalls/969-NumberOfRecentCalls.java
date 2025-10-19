// Last updated: 10/19/2025, 4:58:31 AM
class RecentCounter {
    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        requests.offer(t);

        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */