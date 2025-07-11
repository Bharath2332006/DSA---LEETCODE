class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0 && n==1) return 1;
        int count[]=new int[n+1];
        for(int [] p:trust){
            count[p[0]]--;
            count[p[1]]++;
        }
        for(int p=0;p<count.length;p++){
            if(count[p]==n-1) return p;
        }
        return -1;
        
    }
}