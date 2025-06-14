class Solution {
    public int minMaxDifference(int num) {
        int l=(int)(Math.log10(num)+1);
        int arr[]=new int[l];
        int len=l-1;
        while(num>0){
            int n=num%10;
            arr[len--]=n;
            num/=10;
        }
        int nums1[]=Arrays.copyOf(arr,l);
        int nums2[]=Arrays.copyOf(arr,l);
        int k=0;
        int max=0;
        for(int i=0;i<l;i++){
            if(nums1[i]<9) {
            k=nums1[i];
            break;
            }
        }
        for(int i=0;i<l;i++){
            if(nums1[i]==k) nums1[i]=9;
             
             max=max*10+nums1[i];
        
        }
        int v=nums2[0],min=0;
        for(int i=0;i<nums2.length;i++ ){
            if(nums2[i]==v) nums2[i]=0;

             min=min*10+nums2[i];
            
           

        }
        return (max-min);

        
    }
}