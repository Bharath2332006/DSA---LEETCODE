class Solution {
    public String maximumXor(String s, String t) {
        StringBuilder s1=new StringBuilder();
        int one=0,zero=0;
        for(char c:t.toCharArray()){
            if(c=='1') one++;
            else zero++;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(c=='0'){
                if(one>0) {
                    s1.append('1');
                    one--;
                }else{
                    s1.append('0');
                    zero--;
                }
            }
            else{
                if(zero>0) {
                    s1.append('1');
                    zero--;
                }else{
                    s1.append('0');
                    one--;
                }
            }
        }
        return s1.toString();
    }
}