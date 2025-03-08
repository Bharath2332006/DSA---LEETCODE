class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        blocks=blocks.toUpperCase();
       char[]c=blocks.toCharArray();
       int count=100;
       int m=0;
       if(k==n){
        for(int i=0;i<n;i++){
            if(c[i]!='B'){
                m++;
            }
        }
        count =Math.min(count,m);
       }
       for(int i=0;i<n-k+1;i++){
        int min=0;
        for(int j=i;j<k+i;j++){
            if(c[j]!='B'){
                min++;
            }
        }
        count=Math.min(count,min);
       }
       return count;

    }
}