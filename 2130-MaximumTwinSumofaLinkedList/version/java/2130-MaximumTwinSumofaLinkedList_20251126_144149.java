// Last updated: 11/26/2025, 2:41:49 PM
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
12    public int pairSum(ListNode head) {
13        ListNode fast = head, slow = head;
14
15        while (fast != null && fast.next != null) {
16            slow = slow.next;
17            fast = fast.next.next;
18        }
19
20        ListNode firstHalf = head;
21        ListNode secondHalf = reverse(slow);
22
23        int maxSum = 0;
24
25        while (firstHalf != null && secondHalf != null) {
26            maxSum = Math.max(maxSum, firstHalf.val + secondHalf.val);
27            firstHalf = firstHalf.next;
28            secondHalf = secondHalf.next;
29        }
30
31        return maxSum;
32    }
33
34    private ListNode reverse(ListNode head) {
35        ListNode prev = null;
36
37        while (head != null) {
38            ListNode next = head.next;
39            head.next = prev;
40            prev = head;
41            head = next;
42        }
43
44        return prev;
45    }
46}
47