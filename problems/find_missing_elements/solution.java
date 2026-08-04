class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0],max=nums[0];
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
            set.add(n);
            
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i)) arr.add(i);
        }
        return arr;

    }
}