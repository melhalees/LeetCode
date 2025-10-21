// Last updated: 10/21/2025, 4:23:38 AM
class Solution {
    public int minLength(String s) {
        char[] arr = s.toCharArray();
        int write = 0; // write pointer

        // check if last two form "AB" or "CD"
        for (int read = 0; read < arr.length; read++) {
            arr[write] = arr[read];
            write++;

            if (write >= 2) {
                if ((arr[write - 2] == 'A' && arr[write - 1] == 'B') ||
                    (arr[write - 2] == 'C' && arr[write - 1] == 'D')) {
                    write -= 2; // remove the pair
                }
            }
        }

        return write; // remaining length
    }
}
