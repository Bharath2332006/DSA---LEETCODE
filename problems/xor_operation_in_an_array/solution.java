class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
        int c=0;
        for(int i=0;i<n;i++){
            c=(start+2*i);
            ans=ans^c;
            
        }return ans;
        
        
    }
}