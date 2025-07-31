class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans=new HashSet();
        Set<Integer> cur=new HashSet();
        cur.add(0);
        for(int x:arr){
            Set<Integer> c2=new HashSet();
            for(int y:cur){
                c2.add(x|y);
            }
            c2.add(x);
            cur=c2;
            ans.addAll(cur);
        }
        return ans.size();
    }
}