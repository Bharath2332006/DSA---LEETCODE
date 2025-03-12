class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
    
        int in=0;
        for(int i=0;i<n+1;i++){
            int  count=0;
            String s= Integer.toBinaryString(i);
            for(char ch:s.toCharArray()){
                if(ch=='1'){
                    count++;
                }
            }
            a[in]=count;
            in++;
        }
        return a;
    }
}