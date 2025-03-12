class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        
        
        for(int i=0;i<nums.length;i++){
            boolean b=false;
            for(int j=0;j<nums.length;j++){
                if(j==i) continue;
                if(nums[i]==nums[j]) b=true;
             }
            if(b==false) return nums[i];
        }
        return -1;
    }
}