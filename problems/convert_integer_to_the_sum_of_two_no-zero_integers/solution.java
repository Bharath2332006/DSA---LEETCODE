class Solution {
    static boolean checkzero(int a){
        String s= Integer.toString(a);
        if(s.contains("0")) return false;
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int i=1;i<n;i++){
            int j=n-i;
            if(checkzero(i) && checkzero(j)){
                arr[0]=i;
                arr[1]=j;
                break ;
            }
        }
        return arr;
    }
}