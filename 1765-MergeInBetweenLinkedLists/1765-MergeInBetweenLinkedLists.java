// Last updated: 10/19/2025, 4:58:23 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode currentNode = list1;
        ListNode aNode = null;
        ListNode bNode = null;

        for (int i = 0; i <= b; i++) {
            if (i == a - 1) {
                aNode = currentNode;
            }

            if (i == b) {
                bNode = currentNode.next;
            }

            currentNode = currentNode.next;
        }

        aNode.next = list2;

        ListNode list2LastNode = list2;

        while (list2LastNode.next != null) {
            list2LastNode = list2LastNode.next;
        }

        list2LastNode.next = bNode;

        return list1;
    }
}