class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        
        int dp[][]=new int[n][m];
        for(int r[]:dp) Arrays.fill(r,-1);
        return rec(word1,word2,n-1,m-1,dp);
    }
    public int rec(String word1, String word2,int i,int j, int[][] dp){
        if(i<0) return j+1;
        if(j<0) return i+1;

        if(dp[i][j]!=-1) return dp[i][j];

        if(word1.charAt(i)==word2.charAt(j)) return rec(word1,word2,i-1,j-1,dp);

        int delet=rec(word1,word2,i-1,j,dp);
        int insert=rec(word1,word2,i,j-1,dp);
        int replace=rec(word1,word2,i-1,j-1,dp);

        return dp[i][j]=1+Math.min(delet,Math.min(insert,replace));
        
        
    } 
}