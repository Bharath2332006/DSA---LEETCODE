class Solution {
    public int longestBalanced(String s) {
        int ans=-1;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            int curr=0;
            int maxfreq=0;
            for(int j=i;j<s.length();j++){
                int a=s.charAt(j)-'a';

                if(freq[a]==0) curr++;
                freq[a]++;

                maxfreq=Math.max(maxfreq, freq[a]);

                if(j-i+1 == maxfreq*curr) ans=Math.max(ans,j-i+1);
            
            }
        }
        return ans;
    }
}