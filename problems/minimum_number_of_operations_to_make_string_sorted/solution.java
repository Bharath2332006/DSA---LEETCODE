class Solution {
    interface Power{
        long compute(long x, long y);
    }
    int mod =(int)1e9+7;
    public int makeStringSorted(String s) {
        int n=s.length();
        long fact[]=new long[n+1];
        long invfact[]=new long[n+1];

        Power BinExp =(x,y) -> {
            long res=1;
            while(y>0){
                if((y&1)==1) res=(res*x)%mod;
                x=(x*x)%mod;
                y>>=1;
            }
            return res;
            
        };

        fact[0]=1;
        for(int i=1;i<=n;i++){
            fact[i]=(fact[i-1]*i)%mod;
        }

        invfact[n]=BinExp.compute(fact[n],mod-2);
        for(int i=n-1;i>=0;i--){
            invfact[i]=(invfact[i+1]*(i+1))%mod;
        }
        int count[]=new int[26];
        for(char ch: s.toCharArray()){
            count[ch-'a']++;
        }
        long ans=0;
        for(int i=0;i<n;i++){
            int curr=s.charAt(i)-'a';
            for(int j=0;j<curr;j++){
                if(count[j]==0) continue;
                count[j]--;

                long ways=fact[n-i-1];
                for(int k=0;k<26;k++){
                    ways=(ways*invfact[count[k]])%mod;
                }
                ans=(ans+ways)%mod;
                count[j]++;
            }
            count[curr]--;
        
        }
        return (int)ans;
        


    }
}