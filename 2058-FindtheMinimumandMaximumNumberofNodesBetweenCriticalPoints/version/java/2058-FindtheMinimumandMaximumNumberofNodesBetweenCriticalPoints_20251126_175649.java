// Last updated: 11/26/2025, 5:56:49 PM
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
12    public int[] nodesBetweenCriticalPoints(ListNode head) {
13        if (head == null || head.next == null || head.next.next == null) 
14            return new int[] {-1, -1};
15
16        ListNode prev = head;
17        ListNode curr = head.next;
18        ListNode next = curr.next;
19        int index = 1;
20
21        int firstCriticalIndex = -1;
22        int lastCriticalIndex = -1;
23        int prevCriticalIndex = -1;
24        int minDistance = Integer.MAX_VALUE;
25
26        while (next != null) {
27            if ((curr.val > prev.val && curr.val > next.val) || 
28                (curr.val < prev.val && curr.val < next.val)) {
29
30                if (firstCriticalIndex == -1) firstCriticalIndex = index;
31                if (prevCriticalIndex != -1) {
32                    minDistance = Math.min(minDistance, index - prevCriticalIndex);
33                }
34                prevCriticalIndex = index;
35                lastCriticalIndex = index;
36            }
37
38            // move forward
39            index++;
40            prev = curr;
41            curr = next;
42            next = next.next;
43        }
44
45        if (firstCriticalIndex == lastCriticalIndex) {
46            return new int[] {-1, -1};
47        }
48
49        int maxDistance = lastCriticalIndex - firstCriticalIndex;
50        return new int[] {minDistance, maxDistance};
51    }
52}
53