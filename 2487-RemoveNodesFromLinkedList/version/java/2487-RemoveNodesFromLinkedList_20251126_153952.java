// Last updated: 11/26/2025, 3:39:52 PM
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
12    public ListNode removeNodes(ListNode head) {
13        head = reverse(head);
14
15        ListNode current = head;
16        int maxSoFar = head.val;
17
18        while (current != null && current.next != null) {
19            if (current.next.val < maxSoFar) {
20                current.next = current.next.next;
21            } else {
22                current = current.next;
23                maxSoFar = current.val;
24            }
25        }
26
27        return reverse(head);
28    }
29
30    private ListNode reverse(ListNode head) {
31        ListNode current = head;
32        ListNode prev = null;
33
34        while (current != null) {
35            ListNode next = current.next;
36
37            current.next = prev;
38            prev = current;
39            current = next;
40        }
41
42        return prev;
43    }
44}