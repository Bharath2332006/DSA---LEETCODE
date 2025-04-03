class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;
        if(n == 1) return 0;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if(mid + 1 < n && mid - 1 >= 0 && nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]){
                return mid;
            }
            else if(mid == 0 && nums[mid + 1] < nums[mid]) {
                return 0;
            }
            else if(mid == n - 1 && nums[mid - 1] < nums[mid]) {
                return n - 1;
            }
            else if(mid + 1 < n && nums[mid] < nums[mid + 1]){
                st = mid + 1;
            } else end = mid - 1;
        }
        return n - 1;
    }
}