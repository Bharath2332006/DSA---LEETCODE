class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i+=2){
            if(nums[i]!=nums[i-1]) return false;
        }
        return true;

        
    }
}