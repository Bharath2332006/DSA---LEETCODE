class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int cursum=0;
        for(int num:nums){
            cursum+=num;
            if(cursum>max) max=cursum;
            if(cursum<0) cursum=0;
        }
        return max;
    }
}