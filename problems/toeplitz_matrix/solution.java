class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean b=true;
        for(int i=1;i<=matrix.length-1;i++){
            for(int j=1;j<=matrix[0].length-1;j++){
                if(matrix[i][j]!=matrix[i-1][j-1]){
                    b =false;
                }
            }

        }return b;
    }
}