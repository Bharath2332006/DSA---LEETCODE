class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character , Integer> map=new HashMap<>();
        int a=0;
        int b=0;
        int maxLen=0;
        while(b<s.length()){
            char ch=s.charAt(b);
            if(map.containsKey(ch) && map.get(ch)>=a){
                a=map.get(ch)+1;
            }
            map.put(ch,b);
            int l=b-a+1;
            if(l>maxLen)
            maxLen=l;
            b++;
        }
        return maxLen;
    }
}