class Solution {
    public void nextPermutation(int[] arr) {
        int s=0;
        boolean b=false;
        for(int i=arr.length-2;i>=0;i--){
              if(arr[i]<arr[i+1]){
                s=i;
                b=true;
                break;
            }
            
        }
        if(b==false){
            int i=0,j=arr.length-1;
            while(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }else{
        
         int inx=0;
         for(int in=arr.length-1;in>=0;in--){
                if(arr[in]>arr[s]){
                    inx=in;
                    break;
                }

         }
            int tem=arr[inx];
            arr[inx]=arr[s];
            arr[s]=tem;
            for(int i=s+1;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
        }
        
        


         
    }
}