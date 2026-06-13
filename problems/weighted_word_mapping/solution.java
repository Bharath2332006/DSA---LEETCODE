class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=weights[s.charAt(i)-97];
            }
            sum%=26;
            ans+=(char)('z'-sum);
        }
        return ans;
    }
}