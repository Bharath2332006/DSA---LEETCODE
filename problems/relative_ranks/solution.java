class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String arr[]=new String[n];
        int dup[]=Arrays.copyOf(score,n);
        Arrays.sort(dup);
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(score[i]==dup[j]){
                    if(j==n-1) {
                        arr[i]="Gold Medal";
                        break;
                    }
                    if(j==n-2) {
                        arr[i]="Silver Medal";
                        break;
                    }
                    if(j==n-3) {
                        arr[i]="Bronze Medal";
                        break;
                    }
                    else{
                        int a=n-j;
                        arr[i]=Integer.toString(a);
                        break;
                    }
                }
            }
        }
        return arr;
    }
}