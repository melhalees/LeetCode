// Last updated: 11/28/2025, 8:07:02 PM
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3        int n = position.length;
4
5        if (n == 1) return 1;
6
7        double[] timeToReachForEachCar = new double[target + 1];
8
9        for (int i = 0; i < n; i++) {
10            timeToReachForEachCar[position[i]] = (double)(target - position[i]) / speed[i];
11        }
12
13        int fleets = 0;
14        double maxTime = 0;
15
16        for (int i = timeToReachForEachCar.length - 1; i >= 0; i--) {
17            if (timeToReachForEachCar[i] > maxTime) {
18                maxTime = timeToReachForEachCar[i];
19                fleets++;
20            }
21        }
22
23        return fleets;
24    }
25}