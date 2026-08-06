class Solution {
    public int smallestNumber(int n, int t) {
        return num(n,t);
    }
    int num(int n,int t){
        int p=1;
        int a=n;
        while(a>0){
            p*=(a%10);
            a/=10;
        }
        if(p==0 || p%t==0) return n;
        
        return num(n+1,t);
    }
}