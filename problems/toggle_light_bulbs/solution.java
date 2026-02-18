class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> arr=new ArrayList<>();
        for(int n: bulbs){
            if(iscontains(arr,n)){
                arr.remove(Integer.valueOf(n));
            }else{
                arr.add(n);
            }
        }
        Collections.sort(arr);
        return arr;
        
    }
    public boolean iscontains(List<Integer> arr , int n){
        if(arr.size()==0) return false;
        for(int a:arr){
            if(a==n) return true;
            
        }
        return false;
    }
}