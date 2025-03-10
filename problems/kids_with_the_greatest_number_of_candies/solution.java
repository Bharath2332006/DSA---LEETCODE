class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> m=new ArrayList<Boolean>(Collections.nCopies(candies.length,false));
        int max=0;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        int a[]=Arrays.copyOf(candies,candies.length);
        for(int i=0;i<a.length;i++){
            a[i]+=extraCandies;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>=max){
                m.set(i,true);
            }
        }
        return m;
    }
}