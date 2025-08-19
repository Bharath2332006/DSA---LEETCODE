class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=Integer.MIN_VALUE;
        int r=0;
        for(int n:weights){
            l=Math.max(l,n);
            r+=n;
        }
        while(l<r){
            int mid=(l+r)/2,n=1,curr=0;
            for(int w: weights){
                if(curr+w>mid){
                    n+=1;
                    curr=0;
                }
                curr+=w;
            }
            if(n>days) l=mid+1;
            else r=mid;
        }
        return l;
    }
}