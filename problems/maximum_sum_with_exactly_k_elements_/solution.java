class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++)
            if(nums[i]>=max) max=nums[i];
       
        int sum=0;
        int inc=0;
        while(k-->0){
            sum+=max+inc;
            inc++;
        }
        return sum;
        
    }
}