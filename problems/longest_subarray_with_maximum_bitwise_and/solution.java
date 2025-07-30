class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int i=0, j=0, maxi = 0, maxi_AND = 0;
        while(j<n){
            if(nums[i] == nums[j]) j++;
            else{
                int AND = nums[i];
                if(AND > maxi_AND){
                    maxi_AND = AND;
                    maxi = j-i;
                }
                else if(AND == maxi_AND){
                    maxi = Math.max(maxi, j-i);
                }
                i=j;
                j++;
            }
        }
        if(i<n){
            int AND = nums[i];
            if(AND > maxi_AND) maxi = j-i;
            else if(AND == maxi_AND) maxi = Math.max(maxi, j-i);
        }

        return maxi;
    }
}