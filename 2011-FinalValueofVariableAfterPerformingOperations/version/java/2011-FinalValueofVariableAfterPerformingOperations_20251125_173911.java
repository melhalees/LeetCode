// Last updated: 11/25/2025, 5:39:11 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        for (String operation : operations) {
            if (operation.equals("X++") || operation.equals("++X")) {
                result++;
            } else {
                result--;
            }
        }

        return result;
    }
}