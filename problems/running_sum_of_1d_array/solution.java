class Solution {
    public int[] runningSum(int[] nums) {
        int sum=nums[0];
        int j=1;
        for(int i=0;i<nums.length;i++){
            nums[i]=sum;
            if(j<nums.length){
            sum+=nums[j];
            j++;
            }
        }
        return nums;
        
    }
}