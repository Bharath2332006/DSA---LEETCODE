class Solution {
    public int[] evenOddBit(int n) {
        String s=Integer.toBinaryString(n);
        int ec=0,oc=0;
        for(int i=0;i<s.length();i++){
            int p=s.length()-1-i;
            if(s.charAt(i)=='1'){
                if(p%2==0) ec++;
                else oc++;
            }
        }return new int[]{ec,oc};
    }
}