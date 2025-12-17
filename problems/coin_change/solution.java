class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=rec(coins,dp,amount);
        return ans==999999?-1:ans;
    }
    public int rec(int[] coins, int[] dp, int amount){
        if(amount ==0) return 0;
        if(amount<0) return -2;

        if(dp[amount]!=-1) return dp[amount];

        int mincnt=999999;
        for(int c:coins){
            int res=rec(coins,dp,amount-c);
            if(res!=-2) mincnt=Math.min(mincnt,1+res);
        }
        dp[amount]=mincnt;
        return mincnt;
    }
}