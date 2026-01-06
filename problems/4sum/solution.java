class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=nums.length;
        if(n<4) return arr;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            if((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
            if((long)nums[i]+nums[n-3]+nums[n-2]+nums[n-1]<target) continue;
            
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                if((long)nums[i]+nums[j]+nums[j+1]+nums[j+2]>target) break;
                if((long)nums[i]+nums[j]+nums[n-2]+nums[n-1]<target) continue;

                int l=j+1;
                int r=n-1;
                while(l<r){
                    
                    long sum=(long)nums[i]+nums[j]+nums[l]+nums[r];
                    if(sum==target){
                        List<Integer> row=new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[l]);
                        row.add(nums[r]);
                        arr.add(row);
                        
                        while(l<r && nums[l]==nums[l+1]) l++;
                        while(l<r && nums[r]==nums[r-1]) r--;

                        l++;
                        r--;
                        
                    }
                    else if(sum<target) l++;
                    else r--;
                }
            }

        } 
        return arr;
    }
}