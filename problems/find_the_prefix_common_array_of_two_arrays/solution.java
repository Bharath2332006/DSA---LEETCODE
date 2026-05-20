class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        //if(n==1) return int[]
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            c[i]=noOfcommon(A,B,i);
        }
        return c;
    }
    public int noOfcommon(int[] A, int[] B , int n){
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<=n;i++){
            set.add(A[i]);
            set.add(B[i]);
        }
        return (2*(n+1))-set.size();
    }
}