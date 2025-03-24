class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int tsum=0;
            int z=0;
            il:
            for(int j=i;j<nums.length;j++){
                 if(nums[j]==0){
                    z++;}
                    tsum+=nums[j];
                 
                 if(z<=k) sum=Math.max(tsum+z,sum);

                 if(z>k) break il;
            }
        }return sum;
        
        
    }
}