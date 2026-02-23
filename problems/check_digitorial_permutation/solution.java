class Solution {
    public boolean isDigitorialPermutation(int n) {
        int sum=0;
        String s1=Integer.toString(n);
        int a=n;
        while(a>0){
            sum+=factorial(a%10);
            a/=10;
        }
        return strEquals(s1,Integer.toString(sum));
    }

    public boolean strEquals(String s1, String s2){
        if(s1.length()!=s2.length()) return false;
        int c[]=new int[10];
        for(int i=0;i<s1.length();i++){
            c[s1.charAt(i)-'0']++;
            c[s2.charAt(i)-'0']--;
        }
        for( int a : c) if(a!=0) return false;

        return true;
    }
    public int factorial(int n){
        if(n==0) return 1;
        int a=1;
        while(n>0){
            a*=n;
            n--;
        }
        return a;
    }
}