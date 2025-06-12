class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int diff=Math.abs(nums[i]-nums[(i+1)%nums.length]);
            if(diff>high) high=diff;
        }return high;
        
        
    }
}