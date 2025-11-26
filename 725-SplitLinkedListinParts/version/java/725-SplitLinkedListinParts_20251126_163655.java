// Last updated: 11/26/2025, 4:36:55 PM
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
12    public ListNode[] splitListToParts(ListNode head, int k) {
13        ListNode[] parts = new ListNode[k];
14
15        int linkedListSize = 0;
16        ListNode current = head;
17
18        while (current != null) {
19            linkedListSize++;
20            current = current.next;
21        }
22
23        int baseSizeForChunks = linkedListSize / k;
24        int extra = linkedListSize % k;
25
26        current = head;
27
28        for (int i = 0; i < k; i++) {
29            parts[i] = current;
30
31            int partSize = baseSizeForChunks + (extra > 0 ? 1 : 0);
32            if (extra > 0) extra--;
33
34            for (int j = 0; j < partSize - 1 && current != null; j++) {
35                current = current.next;
36            }
37
38            if (current != null) {
39                ListNode next = current.next;
40                current.next = null;
41                current = next;
42            }
43        }
44
45        return parts;
46    }
47}