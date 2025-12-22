class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String ss=s+s;
        int n=s.length();
        
        for(int i=0;i<(ss.length()-n);i++){
            int j=0;
            while(j<n && ss.charAt(i+j)==goal.charAt(j)){
                j++;
            }
            if(j==n){
                return true;
            }
            
        }
        return false;
    }
}