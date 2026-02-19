class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        int l = 0, r = 0;        
        int maxDiff = n - 1;            
        int maxLen = 1;                 
        int dup = 0;
        
        for(r = 0; r < n; r++) {
            if(r> 0 && nums[r] == nums[r- 1]) {
                dup++;
            }
            
            while(nums[r] - nums[l] > maxDiff) { 
                if(l < n && nums[l] == nums[l+ 1]) {
                    dup--;
                }
                l++;
                
            }
            maxLen = Math.max(maxLen, r- l+ 1 - dup);
        }
        
        return n - maxLen;  
    }
}