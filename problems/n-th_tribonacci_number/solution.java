class Solution {
    public int rec(int[] dp,int n){

        if(dp[n]!=-1) return dp[n];
        else 
           dp[n]=rec(dp,n-1)+rec(dp,n-2)+rec(dp,n-3);
        
        return dp[n];
    }
    public int tribonacci(int n) {
        if(n==0) return n;
        if(n==1 || n==2) return 1;
        int dp[]=new int[n+2];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;
        return rec(dp,n);
    }
}