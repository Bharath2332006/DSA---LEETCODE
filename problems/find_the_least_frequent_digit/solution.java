class Solution {
    public int getLeastFrequentDigit(int n) {
        int arr[]=new int[10];
        int a=n;
        while(a>0){
            int i=a%10;
            arr[i]++;
            a/=10;
        }
        int minfrq=999;
        int ans=-1;
        for(int i=0;i<10;i++){
            if(arr[i]>0 ){
                if(arr[i]<minfrq){
                    minfrq=arr[i];
                    ans=i;
                }
            }
            else if(arr[i]==minfrq && i<ans) ans=i;
        }
        return ans;
    }
}