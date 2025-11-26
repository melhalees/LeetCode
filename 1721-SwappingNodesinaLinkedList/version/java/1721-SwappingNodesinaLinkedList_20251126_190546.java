// Last updated: 11/26/2025, 7:05:46 PM
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
12    public ListNode swapNodes(ListNode head, int k) {
13        ListNode first = head;
14
15        for (int i = 1; i < k; i++) {
16            first = first.next;
17        }
18
19        ListNode second = head;
20        ListNode temp = first;
21
22        while (temp.next != null) {
23            temp = temp.next;
24            second = second.next;
25        }
26
27        int val = first.val;
28        first.val = second.val;
29        second.val = val;
30
31        return head;
32    }
33}