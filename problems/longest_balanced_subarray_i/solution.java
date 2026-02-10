class Solution {
    public int longestBalanced(int[] nums) {
        int count=0;
        HashSet<Integer> odd=new HashSet<>();
        HashSet<Integer> even=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            odd.clear();
            even.clear();
            for(int j=i;j<nums.length;j++){
                if((nums[j]&1) ==0) even.add(nums[j]);
                else odd.add(nums[j]);

                if(odd.size()==even.size()) count=Math.max(count,j-i+1);
            }
        }
        return count;
    }
}