class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
        boolean b[]=new boolean[n];
        b[0]=b[1]=true;
        for(int i=2;i*i<=n;i++){
            if(b[i]) continue;
            for(int j=i*i;j<n;j+=i){
                b[j]=true;
            }
        }
        int ans=0;
        for(int i=2;i<n;i++){
            if(!b[i]) ans++;
        }
        return ans;
    }
}