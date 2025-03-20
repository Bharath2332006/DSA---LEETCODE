class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int p=1;
        for(int i = 0; i < n; i++) {
            ans[i]=p;
            p*=nums[i];
        }
        p=1;
        for(int j=n-1;j>=0;j--){
            ans[j]*=p;
            p*=nums[j];
        }
            return ans;
            
    }
}