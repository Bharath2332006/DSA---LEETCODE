class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,zeros=0,maxl=0;
        for(int i=0;i<nums.length;++i){
            if(nums[i]==0) zeros++;

            while(zeros>1){
                if(nums[l]==0) zeros--;

                l++;
            }
            maxl=Math.max(maxl,i-l);
        }return maxl;
    }
}