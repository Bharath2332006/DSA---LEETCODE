class Solution {
    public int fib(int[] dp,int n){
        if(dp[n]!=-1) return dp[n];
            if(n==1 || n==2) return n;
        else 
           dp[n]= fib(dp,n-1)+fib(dp,n-2);
        
        return dp[n];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[0]=0;
        Arrays.fill(dp,-1);
        return fib(dp,n);
    }
}