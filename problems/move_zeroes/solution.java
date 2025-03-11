class Solution {
    public void moveZeroes(int[] nums) {
        int arr[]=new int[nums.length];
        Arrays.fill(arr,0);
        int inx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[inx++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        
    }
}