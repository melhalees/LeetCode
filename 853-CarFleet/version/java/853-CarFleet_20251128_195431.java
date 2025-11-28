// Last updated: 11/28/2025, 7:54:31 PM
1class Solution {
2    public int carFleet(int target, int[] position, int[] speed) {
3        int n = position.length;
4
5        if (n == 1) return 1;
6
7        double[][] cars = new double[n][2]; // [position, timeToReach]
8
9        for (int i = 0; i < n; i++) {
10            cars[i][0] = position[i];
11            cars[i][1] = (double)(target - position[i]) / speed[i];
12        }
13
14        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
15
16        int fleets = 0;
17        double maxTime = 0;
18
19        for (double[] car : cars) {
20            if (car[1] > maxTime) {
21                maxTime = car[1];
22                fleets++;
23            }
24        }
25
26        return fleets;
27    }
28}