// Last updated: 10/19/2025, 4:58:13 AM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p1 = head;
        ListNode p2 = head.next;

        while (p2 != null) {
            int gcdValue = gcd(p1.val, p2.val);
            ListNode toBeInsertedNode = new ListNode(gcdValue);

            p1.next = toBeInsertedNode;
            toBeInsertedNode.next = p2;

            p1 = p2;
            p2 = p2.next;
        }

        return head;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
