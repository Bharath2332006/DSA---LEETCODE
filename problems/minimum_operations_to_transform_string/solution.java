class Solution {
    public int minOperations(String s) {
        int ans=0;
        for(char c:s.toCharArray()){
            int step=(26-(c-'a'))%26;
            ans=Math.max(step,ans);
        }
        return ans;
    }
}