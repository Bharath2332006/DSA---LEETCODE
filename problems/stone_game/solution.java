class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++) dp[i][i]=piles[i];

        for(int l=2;l<=n;l++){
            for(int i=0;i+l-1<n;i++){
                int j=i+l-1;
                int tl=piles[i]-dp[i+1][j];
                int tr=piles[j]-dp[i][j-1];
                dp[i][j]=Math.max(tl,tr);
            }
        }
        return dp[0][n-1]>0;
    }
}