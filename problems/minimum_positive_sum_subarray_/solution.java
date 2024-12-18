class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
     int min=Integer.MAX_VALUE;
     
     int N=nums.size();
     for(int i=0;i<N;i++){
        int sum=0;
        for( int j=i;j<N;j++){
            sum+=nums.get(j);
            if(j-i+1>=l && j-i+1<=r){
                if(sum>0){
                    min=Math.min(min,sum);
                    
                }
            }else if(j-i+1>r){
                break;
            }


        }
     }if(min==Integer.MAX_VALUE)return -1;
     return min;   
    }
}