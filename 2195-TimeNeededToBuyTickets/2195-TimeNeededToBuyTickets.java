// Last updated: 10/19/2025, 4:58:17 AM
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        int n = tickets.length;
        int remaining = tickets[k];

        for (int i = 0; i < n; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], remaining);
            } else {
                time += Math.min(tickets[i], remaining - 1);
            }
        }

        return time;
    }
}
