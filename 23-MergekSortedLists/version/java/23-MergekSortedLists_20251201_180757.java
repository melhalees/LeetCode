// Last updated: 12/1/2025, 6:07:57 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
14
15        for (ListNode list : lists) {
16            if (list != null) {
17                pq.add(list);
18            }
19        }
20
21        ListNode dummy = new ListNode(0);
22        ListNode current = dummy;
23
24        while (!pq.isEmpty()) {
25            ListNode smallest = pq.poll();
26
27            current.next = smallest;
28            current = current.next;
29
30            if (smallest.next != null) {
31                pq.add(smallest.next);
32            }
33        }
34
35        return dummy.next;
36    }
37}
38