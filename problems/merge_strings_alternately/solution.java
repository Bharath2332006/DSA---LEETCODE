class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int i=0,j=0,cnt=0;
        while(cnt<word1.length()+word2.length()){
            if(i<word1.length()){
                ans+=word1.charAt(i);
                i++;
                cnt++;
            }
            if(j<word2.length()){
                ans+=word2.charAt(j);
                j++;
                cnt++;
            }
        }
        return ans;
    }
}