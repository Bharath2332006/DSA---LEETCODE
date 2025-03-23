class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int l[]=new int[n];
        l[0]=0;
        int r[]=new int[n];
        r[n-1]=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            l[i]=sum1;
            sum1+=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            r[i]=sum2;
            sum2+=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=Math.abs(l[i]-r[i]);
        }
        return nums;
    }
}