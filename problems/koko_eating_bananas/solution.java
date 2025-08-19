class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int ans=Integer.MAX_VALUE;
        int l=1;
        int r=Integer.MIN_VALUE;
        for(int n: piles) r=Math.max(n,r);
        while(l<=r){
            int mid=(l+r)/2;
            int count=0;
            for(int i=0;i<piles.length;i++){
                count+=Math.ceil((double)piles[i]/(double)mid);
            }
            
            if(count>h) l=mid+1;
            else{
                ans=Math.min(mid,ans);
                r=mid-1;
            }

        }
        return ans;
    }
}