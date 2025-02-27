class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
       /* double max=Integer.MIN_VALUE;
        if(n==1){
            max=nums[n-1]/k;
        }else{
        for(int i=0;i<n-k+1;i++){
            double avg=0;
            double  temp=0;
            for(int j=i;j<i+k;j++){
                  temp+=nums[j];
            }
            avg=temp/k;
            
            max=Math.max(max,avg);
        }
        }
        return max;*/
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        double max=sum;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];
            max=Math.max(max,sum);
        }
        return max/k;

    }
}