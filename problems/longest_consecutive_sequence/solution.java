class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int longest = 1, last = Integer.MIN_VALUE, cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]-1 == last){
                cnt++;
                last = nums[i];
            }
            if(nums[i] != last){
                cnt = 1;
                last = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}