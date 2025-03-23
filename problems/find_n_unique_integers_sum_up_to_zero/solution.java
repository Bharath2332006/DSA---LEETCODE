class Solution {
    public int[] sumZero(int n) {
        int arr[]=new int[n];
        if(n%2==0){
            int a=n/2;
            int m=0;
            for(int i=0;i<n;i++){
                if(i<a){
                    arr[i]=i+1;
                }else{
                    arr[i]=arr[m]*(-1);
                    m++;
                }
            }
        }else{
            int a=n/2;
            int m=1;
            for(int i=0;i<n;i++){
                if(i<=a){
                    arr[i]=i;
                }
                else{
                    arr[i]=arr[m]*(-1);
                    m++;
                }
            }
        }
        return arr;
        
    }
}