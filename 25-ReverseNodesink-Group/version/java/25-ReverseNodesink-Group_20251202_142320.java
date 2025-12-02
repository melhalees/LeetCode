// Last updated: 12/2/2025, 2:23:20 PM
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
12
13    public ListNode reverseKGroup(ListNode head, int k) {
14        if (head == null || k == 1) return head;
15
16        ListNode dummy = new ListNode(-1);
17        dummy.next = head;
18
19        ListNode prevGroupTail = dummy;
20        ListNode groupHead = head;
21        ListNode current = head;
22
23        int p = 1;
24
25        while (current != null) {
26
27            if (p == k) {
28
29                ListNode nextGroupHead = current.next;
30
31                ListNode[] reversed = reverse(groupHead, current);
32
33                ListNode newHead = reversed[0];
34                ListNode newTail = reversed[1];
35
36                prevGroupTail.next = newHead;
37                newTail.next = nextGroupHead;
38
39                prevGroupTail = newTail;
40                groupHead = nextGroupHead;
41                current = nextGroupHead;
42                p = 1;
43
44            } else {
45                p++;
46                current = current.next;
47            }
48        }
49
50        return dummy.next;
51    }
52
53
54    private ListNode[] reverse(ListNode start, ListNode end) {
55        ListNode prev = end.next;
56        ListNode current = start;
57
58        while (prev != end) {
59            ListNode next = current.next;
60            current.next = prev;
61            prev = current;
62            current = next;
63        }
64
65        return new ListNode[] { end, start };
66    }
67}
68