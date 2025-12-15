class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>arr.get(arr.size()-1)){
                arr.add(nums[i]);
            }else{
                int inx=BS(arr, nums[i]);
                arr.set(inx, nums[i]);
            }
        }
        return arr.size();
    }
    public int BS(List<Integer> arr, int num){
        int l=0;
        int r=arr.size()-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr.get(mid)==num) return mid;
            else if(arr.get(mid)>num) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}