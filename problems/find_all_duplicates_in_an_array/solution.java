class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr= new ArrayList<>();
            Arrays.sort(nums);
            for(int i=1;i<nums.length;i++){
                if(nums[i]==nums[i-1]){
                    arr.add(nums[i]);
                }
            }

        return arr;
        
    }
}