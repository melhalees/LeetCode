// Last updated: 10/19/2025, 4:59:01 AM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // end of nums1
        int p2 = m + n - 1; // end of merged nums 1
        int p3 = n - 1; // end of nums2

        while(p3 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p3]) {
                nums1[p2--] = nums1[p1--];
            }
            else {
                nums1[p2--] = nums2[p3--];
            }
        }
    }
}
