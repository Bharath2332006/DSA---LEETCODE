class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]={-1,-1};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                ans[0]=map.get(req);
                ans[1]=i;
                break;
            }else{
                map.put(nums[i],i);
            }

        }
        return ans;

    }
}