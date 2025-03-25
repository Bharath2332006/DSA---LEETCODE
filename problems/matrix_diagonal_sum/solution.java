class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int r=mat.length,c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j){
                    sum+=mat[i][j];
                    mat[i][j]=0;
                }

            }
        }int i1=0,j1=mat[0].length-1;
        while(i1<r && j1>=0){
            sum+=mat[i1][j1];
            i1++;
            j1--;
        }
        return sum;
        
    }
}