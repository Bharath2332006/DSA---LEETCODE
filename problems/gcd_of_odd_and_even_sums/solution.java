class Solution {
    public int gcdOfOddEvenSums(int n) {
        int even=0,odd=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0) even+=i;
            else odd+=i;
        }
        return n;
    }
    public int gcd(int a,int b){
        if(b==0) return a;
        int rem=a%b;
        return gcd(b,rem);
    }
}