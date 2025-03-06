class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         Set<Integer> s=new HashSet<>();
        

        
         List<Integer> m=new ArrayList<>();
         for(int nu:nums) s.add(nu);
         for(int i=1;i<=nums.length;i++){
            if(!s.contains(i)){
                m.add(i);
            }
            else{
                continue;
            }
         }
         return m ;
        
    }
}