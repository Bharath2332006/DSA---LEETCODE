class Solution {
    public int maxDifference(String s) {
        int count[]=new int[26];
        int max=0,min=s.length();
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i]%2!=0){
                max=Math.max(max,count[i]);
            }if(count[i]%2==0 && count[i]>0){
                min=Math.min(min,count[i]);
            }
        }return max-min;
    }
}