class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0;
        for(int in:nums){
            sum+=in;
        }

        return (sum%k);
        
    }
}