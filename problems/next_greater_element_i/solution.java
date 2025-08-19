class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        //boolean b[]=new int[nums2.length];
        //Array.fill(b,false);
        for(int i=0;i<nums1.length;i++){
            arr[i]=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    for(int j1=j+1;j1<nums2.length;j1++){
                      if(nums2[j1]>nums1[i]){
                        arr[i]=nums2[j1];
                        break;
                        }
                    }
                }
            }

        }return arr;
    }
}