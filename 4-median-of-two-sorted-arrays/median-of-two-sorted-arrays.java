class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length + nums2.length];
        int n = nums1.length - 1;
        int m = nums2.length - 1;
        int i = arr.length - 1;
        while (n >= 0 && m >= 0) {
            if (nums1[n] > nums2[m]) {
                arr[i] = nums1[n];
                n--;
            } else {
                arr[i] = nums2[m];
                m--;
            }
            i--;
        }
        while (n >= 0) {
            arr[i] = nums1[n];
            n--;
            i--;
        }

        while (m >= 0) {
            arr[i] = nums2[m];
            m--;
            i--;
        }
        int len = arr.length;

        if (len % 2 == 1) {
            return arr[len / 2];
        } else {
            return ((double) arr[len / 2 - 1] + arr[len / 2]) / 2.0;
        }
    }
}