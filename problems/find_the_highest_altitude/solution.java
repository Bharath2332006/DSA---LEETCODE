class Solution {
    public int largestAltitude(int[] gain) {
        int alt=0;
        int ca=0;
        for(int i=0;i<gain.length;i++){
            ca+=gain[i];
            alt=Math.max(alt,ca);
        }
        

        return alt;

    }
}