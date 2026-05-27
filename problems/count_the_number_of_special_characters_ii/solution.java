class Solution {
    public int numberOfSpecialChars(String word) {
        int alp[]=new int[26];
        int cnt[]=new int[26];
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                if(alp[word.charAt(i)-65]>0 && cnt[word.charAt(i)-65]==0){
                    cnt[word.charAt(i)-65]=1;
                    alp[word.charAt(i)-65]=0;
                }else {
                    if(cnt[word.charAt(i)-65]!=1)
                        cnt[word.charAt(i)-65]=-1;
                }
            }
            else{
                    if(cnt[word.charAt(i)-'a']==1) cnt[word.charAt(i)-'a']=-1;
                    else alp[word.charAt(i)-'a']++;
            }
        }
        int ans=0;
        for( int num:cnt) {
            if(num!=-1) ans+=num;
        }

        return ans;

        
    }
}