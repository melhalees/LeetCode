// Last updated: 10/19/2025, 4:58:56 AM
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        if (n == 0) return 0;

        int total = 1;
        int up = 0;
        int down = 0;
        int oldSlope = 0;

        for (int i = 1; i < n; i++) {
            int newSlope = 0;
            if (ratings[i] > ratings[i - 1]) newSlope = 1;
            else if (ratings[i] < ratings[i - 1]) newSlope = -1;

            if ((oldSlope > 0 && newSlope == 0) || (oldSlope < 0 && newSlope >= 0)) {
                total += (up * (up + 1)) / 2 + (down * (down + 1)) / 2 + Math.max(up, down);
                up = 0;
                down = 0;
            }

            if (newSlope > 0) up++;
            else if (newSlope < 0) down++;
            else total++;

            oldSlope = newSlope;
        }

        total += (up * (up + 1)) / 2 + (down * (down + 1)) / 2 + Math.max(up, down);

        return total;
    }
}
