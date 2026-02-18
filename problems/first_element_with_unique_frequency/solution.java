class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int n:map.values()){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(int n:nums){
            
            if(count.get(map.get(n))==1) return n;
        }
        return -1;
        
    }
}