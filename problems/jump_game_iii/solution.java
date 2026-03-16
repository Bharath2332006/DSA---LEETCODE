class Solution {
    boolean b=false;
    public boolean canReach(int[] arr, int start) {
        int[] dp=new int[arr.length];
        isvalid(arr,start,dp);
        return b;
    }
    public void isvalid( int[] arr, int inx, int [] dp){
        if(b==true) return;
        if(inx>=arr.length || inx<0) return ;
        else if(arr[inx]==0){
            b=true;
            return;
        }
        if(dp[inx]==1) return;
        dp[inx]=1;
        isvalid(arr, inx-arr[inx],dp);
        isvalid(arr , arr[inx]+inx,dp);
       


    }

}