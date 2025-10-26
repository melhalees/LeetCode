// Last updated: 10/26/2025, 11:26:23 PM
class Solution {
    public int maxProduct(int[] nums) {
        int a = 0, b = 0;

        for (int num : nums) {
            if (num > a) {
                b = a;
                a = num;
            } else if (num > b) {
                b = num;
            }
        }

        return --a * --b;
    }
}