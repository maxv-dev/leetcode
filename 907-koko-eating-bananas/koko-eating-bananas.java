class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int right = 0;
        for (int i = 0; i < n; i++) {
            right = Math.max(right, piles[i]);
        }
        int left = 1;
        int ans = right;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (getval(piles, mid) <= h) {
                ans = mid;
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static int getval(int piles[], int k) {
        int hrs = 0;
        for (int i = 0; i < piles.length; i++) {
            hrs = hrs + piles[i] / k;
            if (piles[i] % k != 0) {
                hrs++;
            }
        }
        return hrs;

    }
}