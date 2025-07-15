class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[]={-1,-1};
        arr[0]=binarysearch(nums,target,true);
        arr[1]=binarysearch(nums,target,false);
        return arr;
       
    }
    static int binarysearch(int[] nums, int target,boolean b){
        int l=0,r=nums.length-1;
        int ans=-1;
        while(l<=r){
             int mid=l+(r-l)/2;
             if(nums[mid]>target){
                r=mid-1;
             }else if(nums[mid]<target){
                l=mid+1;
             }else{
                ans=mid;
                if(b){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
             }

        }return ans;
    }
}