// Last updated: 11/26/2025, 2:29:30 PM
1class Solution {
2    public int pairSum(ListNode head) {
3
4        ListNode slow = head, fast = head;
5
6        while (fast != null && fast.next != null) {
7            slow = slow.next;
8            fast = fast.next.next;
9        }
10
11        ListNode second = reverse(slow);
12        ListNode first = head;
13
14        int max = 0;
15        while (second != null) {
16            max = Math.max(max, first.val + second.val);
17            first = first.next;
18            second = second.next;
19        }
20
21        return max;
22    }
23
24    private ListNode reverse(ListNode head) {
25        ListNode prev = null;
26        while (head != null) {
27            ListNode next = head.next;
28            head.next = prev;
29            prev = head;
30            head = next;
31        }
32        return prev;
33    }
34}
35