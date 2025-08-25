class Solution {
    public int addDigits(int num) {

        return rec(num);
        
        
    }
    static int rec(int n){
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=d;
            n/=10;

        }
        return (sum>9)?rec(sum):sum;
    }
}