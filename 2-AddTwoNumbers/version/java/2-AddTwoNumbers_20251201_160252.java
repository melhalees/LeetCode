// Last updated: 12/1/2025, 4:02:52 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13
14        ListNode dummy = new ListNode(0);
15        ListNode current = dummy;
16
17        ListNode p1 = l1;
18        ListNode p2 = l2;
19
20        int carry = 0;
21
22        while (p1 != null || p2 != null) {
23            int x = (p1 != null) ? p1.val : 0;
24            int y = (p2 != null) ? p2.val : 0;
25
26            int sum = x + y + carry;
27
28            int digit = sum % 10;
29            carry = sum / 10;
30
31            current.next = new ListNode(digit);
32            current = current.next;
33
34            if (p1 != null) p1 = p1.next;
35            if (p2 != null) p2 = p2.next;
36        }
37
38        if (carry > 0)
39            current.next = new ListNode(carry);
40
41        return dummy.next;
42    }
43}
44