class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;

        int target = nums[0];
        for (int x : nums) {
            target &= x;
        }

        boolean allEqual = true;
        for (int x : nums) {
            if (x != nums[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) return 0;
        int total = nums[0];
        for (int i = 1; i < n; i++) {
            total &= nums[i];
        }
        if (total == target) return 1;

        int ops = 0;
        int cur = ~0;
        for (int x : nums) {
            cur &= x;
            if (cur == target) {
                ops++;
                cur = ~0;
            }
        }

        return ops;
    }
}