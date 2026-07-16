class Solution {
    public long gcdSum(int[] nums) {
        int g[]=new int [nums.length];
        g[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            g[i]=gcd(nums[i],max);

        }
        Arrays.sort(g);
        long ans=0;
        int i=0,j=g.length-1;
        while(i<j){
            ans+=gcd(g[i],g[j]);
            i++;
            j--;
        }
        return ans;
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        int rem=a%b;
        return gcd(b,rem);
    }
}