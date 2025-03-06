class Solution {
    public boolean isPalindrome(int x) {
        boolean t=false;
        int a=x;
        int b=0;
        while(a>0){
            b+=a%10;
            a/=10;
            if(a!=0)  b*=10;
        }
        if(x==b){
            t=true;
        }
        return t;
    }
    
}