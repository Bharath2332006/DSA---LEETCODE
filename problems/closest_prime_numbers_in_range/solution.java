class Solution {
    public int[] closestPrimes(int left, int right) {
        List<Integer> a=new ArrayList<>();
        boolean []b=new boolean[right+1];
        Arrays.fill(b,true);
        b[0]=b[1]=false;
        for(int i=2;i*i<=right;i++){
            if(b[i]){
                for(int m=i*i;m<=right;m+=i){
                    b[m]=false;
                }
            }
        }for(int i=left;i<=right;i++){
            if(b[i]){
                a.add(i);
            }
        }
        if(a.size()<2)
        return new int[]{-1,-1};

        int mid=Integer.MAX_VALUE;
        int c[]=new int[2];
        for(int i=1;i<a.size();i++){
            int diff=a.get(i)-a.get(i-1);
            if(diff<mid){
                mid=diff;
                c[0]=a.get(i-1);
                c[1]=a.get(i);

            }
        }
        return c;



    }
}    