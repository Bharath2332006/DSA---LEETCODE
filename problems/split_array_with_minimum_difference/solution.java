class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        long[] pref = new long[n];
        boolean[] inc = new boolean[n];
        boolean[] dec = new boolean[n];
        pref[0] = nums[0];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + nums[i];
            inc[i] = inc[i - 1] && nums[i] > nums[i - 1];
        }
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = dec[i + 1] && nums[i] > nums[i + 1];
        }
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (inc[i] && dec[i + 1]) {
                long left = pref[i];
                long right = pref[n - 1] - pref[i];
                long diff = left - right;
                if (diff < 0) diff = -diff;
                if (diff < ans) ans = diff;
            }
        }
        if (ans == Long.MAX_VALUE) return -1;
        return ans;
    }
}