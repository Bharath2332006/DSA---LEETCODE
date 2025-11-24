class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list= new  ArrayList<>();
        int n=0;
        for(int num:nums){
            n=((n*2)+num )%5;
            list.add(n==0);
            
           
        }
        return list;

    }
}