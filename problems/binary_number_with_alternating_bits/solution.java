class Solution {
    public boolean hasAlternatingBits(int n) {
     //StringBuilder b=new StringBuilder();
     //long p=1;
     ////while(n>0){
       // b.insert(0,n%2);
       // n/=2;
        //p*=10;
     //}
     String s=Integer.toBinaryString(n);
     for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)) return false;
     }  
     return true; 
        
    }
}