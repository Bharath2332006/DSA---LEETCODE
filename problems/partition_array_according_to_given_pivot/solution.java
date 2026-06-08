class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int i=0;
        int inx=0;
        int pivcnt=0;
        while(i<nums.length){
            if(nums[i]<pivot){
                ans[inx++]=nums[i];
            }
            if(nums[i]==pivot) pivcnt++;
            i++;
        }
        for(int il=0;il<pivcnt;il++){
            ans[inx++]=pivot;
        }
        i=0;
        while(i<nums.length){
            if(nums[i]>pivot){
                ans[inx++]=nums[i];
            }
            i++;
        }
        return ans;

    }
}