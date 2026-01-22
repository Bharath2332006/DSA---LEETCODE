class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        int i=0,j=n,inx=1;
        while(i<n && j<2*n){
            arr[inx-1]=nums[i];
            arr[inx]=nums[j];
            inx+=2;
            i++;
            j++;
        }
        return arr;
    }
}