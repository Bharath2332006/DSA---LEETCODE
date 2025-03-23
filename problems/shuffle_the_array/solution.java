class Solution {
    public int[] shuffle(int[] nums, int n) {
        int a[]=new int[n*2];
        int i=0,j=1;
        int m=n;
        int s=0;
        while(j<2*n){
            a[i]=nums[s];
            i+=2;
            s++;
            a[j]=nums[m];
            m++;
            j+=2;
        }
        return a;
        
    }
}