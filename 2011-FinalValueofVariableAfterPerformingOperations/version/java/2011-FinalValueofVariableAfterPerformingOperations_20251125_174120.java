// Last updated: 11/25/2025, 5:41:20 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.charAt(0) == '+' || operation.charAt(2) == '+' ) {
                result++;
            } else {
                result--;
            }
        }

        return result;
    }
}