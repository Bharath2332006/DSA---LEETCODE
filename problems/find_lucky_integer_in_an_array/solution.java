class Solution {
    public int findLucky(int[] arr) {
        int ans=-1;
        int freq[]=new int[501];
        for (int nums:arr){
            freq[nums]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==i){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}