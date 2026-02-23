class Solution {
    public int scoreDifference(int[] nums) {
        int first=0,second=0;
        boolean s=true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0) {
                s=!s;
            }
            if((i+1)%6==0) {
                s=!s;
            }
            if(s) first+=nums[i];
            else second+=nums[i];

        }
        return first-second;
    }
}