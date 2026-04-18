class Solution {
    public int mirrorDistance(int n) {
        int a=n;
        int n2=0;
        while(a>0){
            n2*=10;
            n2+=a%10;
            a/=10;
        }
        return Math.abs(n2-n);
    }

}