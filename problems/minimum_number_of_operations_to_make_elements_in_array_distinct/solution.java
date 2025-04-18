class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        while (nums.length != Arrays.stream(nums).boxed().collect(Collectors.toSet()).size()) {
            nums = nums.length > 3 ? Arrays.copyOfRange(nums, 3, nums.length) : new int[0];
            res++;
        }

        return res;
    }
}