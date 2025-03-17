class Solution {
    public int pivotIndex(int[] nums) {
         int inx=0;
         while(inx<nums.length){
            int l=0;
            int r=0;
            for(int i=0;i<nums.length;i++){
                if(i<inx) l+=nums[i];
                if(i>inx) r+=nums[i];
            }
            if(l==r) return inx;
            else inx++;
         }
         return -1;
    }
}