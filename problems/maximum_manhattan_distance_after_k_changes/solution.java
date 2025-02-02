class Solution {
    public int maxDistance(String s, int k) {
        int n=0 ,so=0,e=0,w=0;
        int max=0;

        for(char c:s.toCharArray()){
            if(c=='N'){
                n++;
            }
             if(c=='S'){
                so++;
            }
             if(c=='E'){
                e++;
            }
             if(c=='W'){
                w++;
            }
        
        max=Math.max(max,n+e-w-so+2 * Math.min(so+w,k));
         max=Math.max(max,n+w-so-e+2 * Math.min(so+e,k));
         max=Math.max(max,so+e-n-w+2 * Math.min(n+w,k));
         max=Math.max(max,so+w-n-e+2 * Math.min(n+e,k));
        }
        return max;
        
    }
}