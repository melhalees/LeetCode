// Last updated: 10/19/2025, 4:58:15 AM
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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] matrix = new int[m][n];
        for (int[] row : matrix) Arrays.fill(row, -1);
        
        int[][] dirs = {{0,1}, {1,0}, {0,-1}, {-1,0}};
        int dir = 0;
        int row = 0, col = 0;
        
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        
        ListNode curr = head;
        
        while (curr != null) {
            matrix[row][col] = curr.val;
            curr = curr.next;
            
            int nextRow = row + dirs[dir][0];
            int nextCol = col + dirs[dir][1];
            
            if (nextRow < top || nextRow > bottom || nextCol < left || nextCol > right || matrix[nextRow][nextCol] != -1) {
                if (dir == 0) top++;
                else if (dir == 1) right--;
                else if (dir == 2) bottom--;
                else if (dir == 3) left++;

                dir = (dir + 1) % 4;
                
                nextRow = row + dirs[dir][0];
                nextCol = col + dirs[dir][1];
            }
            
            row = nextRow;
            col = nextCol;
        }
        
        return matrix;
    }
}
