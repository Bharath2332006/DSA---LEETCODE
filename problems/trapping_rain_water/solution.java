class Solution {
    public int trap(int[] arr) {
        int lef[]=new int[arr.length];
        int rig[]=new int[arr.length];
        int count=0;
        for(int i=1;i<arr.length;i++){
            lef[i]=Math.max(lef[i-1],arr[i-1]);
        }
        for(int i=arr.length-2;i>=0;i--){
            rig[i]=Math.max(rig[i+1],arr[i+1]);
        }
    
        for(int i=0;i<arr.length;i++){
            int temp=Math.min(lef[i],rig[i])-arr[i];
            if(temp<0) temp=0;
            count+=temp;
        }
        return count;
    }
}