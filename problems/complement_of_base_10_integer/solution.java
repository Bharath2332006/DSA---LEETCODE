class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1') sc.append('0');
            else sc.append('1');
        }
        return Integer.parseInt(sc.toString(),2);
    }
}