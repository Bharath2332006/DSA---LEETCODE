class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int capacity=n*n;
        int count=0;
        int w1=w;
        for(int i=1;i<=capacity;i++){
            if(w1<=maxWeight){
                count++;
                w1=w1+w;
            }else{
                break;
            }
            
        }return count;
    }
}