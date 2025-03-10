class Solution {
    public boolean isPalindrome(int x) {
     int a=Math.abs(x);
     boolean ba=false;
     int s=0;
     while(a>0){
       int b=a%10;
       s+=b;
       a/=10;
       if(a>0){
        s*=10;
       }
    }  
    if(s==x){
        ba=true;
    }
     
     return ba;
    }
}