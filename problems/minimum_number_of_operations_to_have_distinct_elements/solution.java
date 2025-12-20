class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int x:nums){
            freq.put(x,freq.getOrDefault(x,0)+1);
        }
        int cnt=0;
        for(int v:freq.values()){
            if(v>1) cnt++;
        }
        if(cnt==0) return 0;

        int op=0;
        int i=0;
        while(i<n){

            for(int k=0;k<3 && i<n ;k++,i++){
                int val=nums[i];
                int c=freq.get(val);

                if(c==2) cnt--;
                freq.put(val,c-1);
            }
            op++;
            if(cnt==0) break;
        }
        return op;
    }
}