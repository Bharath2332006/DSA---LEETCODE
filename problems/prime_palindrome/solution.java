class Solution {
    public int primePalindrome(int n) {

        while (true) {
            if (palindrom(n) && prime(n)) {
                return n;
            }
            if (n > 10000000 && n < 100000000) {return 100030001;}
            n++;
        }
    }
    static boolean palindrom(int n){
        int x=n,rev=0;
        while(n>0){
            rev=(rev*10)+n%10;
            n/=10;
        }
        return rev==x;

    }
    static boolean prime(int n){
        if(n<2) return false;
        if (n == 2) return true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false; 
        }
        return true;
    }
}