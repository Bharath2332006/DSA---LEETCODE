class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
       
        for(int i=0;i<n;i++){
            int index=0;
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }/*else{
                    i++;
                    break;
                }*/
                
            }


        }
        return new int[]{0,1};

        
        
        
        
        
    }
}