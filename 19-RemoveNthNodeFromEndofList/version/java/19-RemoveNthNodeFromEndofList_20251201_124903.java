// Last updated: 12/1/2025, 12:49:03 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode dummy = new ListNode(0, head);
14        ListNode start = dummy;
15        ListNode end = dummy;
16
17        for (int i = 0; i <= n; i++) {
18            end = end.next;
19        }
20
21        while (end != null) {
22            start = start.next;
23            end = end.next;
24        }
25
26        start.next = start.next.next;
27
28        return dummy.next;
29    }
30}