// Last updated: 11/26/2025, 5:13:30 PM
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
12    public ListNode modifiedList(int[] nums, ListNode head) {
13        Set<Integer> numsSet = new HashSet<>();
14        for (int num : nums) numsSet.add(num);
15
16        ListNode dummy = new ListNode(0);
17        dummy.next = head;
18
19        ListNode prev = dummy;
20        ListNode curr = head;
21
22        while (curr != null) {
23            if (numsSet.contains(curr.val)) {
24                prev.next = curr.next;
25            } else {
26                prev = curr;
27            }
28            curr = curr.next;
29        }
30
31        return dummy.next;
32    }
33}
34