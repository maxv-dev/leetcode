class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int p = nums1.length - 1;
        int q = nums2.length - 1;
        int[] arr = new int[n];
        int r = n - 1;
        while (p >= 0 || q >= 0) {
            if (p < 0) {
                arr[r] = nums2[q];
                q--;
            } else if (q < 0) {
                arr[r] = nums1[p];
                p--;
            } else if (q >= 0 && nums2[q] > nums1[p]) {
                arr[r] = nums2[q];
                q--;
            } else {
                arr[r] = nums1[p];
                p--;
            }
            r--;
        }
        if (n % 2 == 1) {
            return (double) arr[n / 2];
        } else {
            double ans = (double) (arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
            return ans;
        }
    }
}