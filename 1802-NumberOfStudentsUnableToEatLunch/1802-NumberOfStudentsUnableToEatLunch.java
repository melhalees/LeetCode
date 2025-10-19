// Last updated: 10/19/2025, 4:58:22 AM
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2]; // [0] -> circular 2, [1] -> square 4

        for (int s : students) {
            count[s]++;
        }

        for (int sandwich : sandwiches) {
            if (count[sandwich] == 0) {
                break;
            }
            count[sandwich]--;
        }

        return count[0] + count[1];
    }
}
