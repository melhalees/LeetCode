// Last updated: 10/19/2025, 4:58:16 AM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode currentNode = head;
        ListNode currentZeroNode = null;

        while (currentNode.next != null) {
            if (currentNode.val == 0) {
                currentZeroNode = currentNode;
            } else {
                currentZeroNode.val += currentNode.val;
                currentZeroNode.next = currentNode.next;
            }
            currentNode = currentNode.next;
        }

        currentZeroNode.next = null;
        
        return head;
    }
}