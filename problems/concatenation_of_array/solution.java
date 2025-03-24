class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a[]=new int[n*2];
        int j=0;
        for(int i=0;i<n*2;i++){
            if(i<n) a[i]=nums[i];
             else{
                a[i]=nums[j];
                j++;
             }
        }
        return a;
        
    }
}