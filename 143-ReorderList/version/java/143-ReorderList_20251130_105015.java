// Last updated: 11/30/2025, 10:50:15 AM
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
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null) return;
14
15        // 1. Find the middle of the list
16        ListNode slow = head, fast = head;
17        while (fast != null && fast.next != null) {
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21
22        // 2. Reverse the second half
23        ListNode prev = null, curr = slow.next;
24        slow.next = null;  // cut the list into two halves
25
26        while (curr != null) {
27            ListNode nextTemp = curr.next;
28            curr.next = prev;
29            prev = curr;
30            curr = nextTemp;
31        }
32
33        // prev now is the head of reversed second half
34
35        // 3. Merge two halves
36        ListNode first = head, second = prev;
37
38        while (second != null) {
39            ListNode tmp1 = first.next;
40            ListNode tmp2 = second.next;
41
42            first.next = second;
43            second.next = tmp1;
44
45            first = tmp1;
46            second = tmp2;
47        }
48    }
49}
50