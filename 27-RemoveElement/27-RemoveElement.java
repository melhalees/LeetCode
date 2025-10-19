// Last updated: 10/19/2025, 4:59:11 AM
class Solution {
    public int removeElement(int[] nums, int val) {
        int sp = 0;

        for (int fp = 0; fp < nums.length; fp++) {
            if (nums[fp] != val) {
                nums[sp++] = nums[fp];
            }
        }

        return sp;
    }
}