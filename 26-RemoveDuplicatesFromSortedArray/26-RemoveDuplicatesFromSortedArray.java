// Last updated: 10/19/2025, 4:59:12 AM
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 1) return 1;

        int sp = 0;
        
        for (int fp = 1; fp < nums.length; fp++) {
            if (nums[sp] != nums[fp]) {
                nums[sp + 1] = nums[fp];
                sp++;
            }
        }

        return sp + 1;
    }
}