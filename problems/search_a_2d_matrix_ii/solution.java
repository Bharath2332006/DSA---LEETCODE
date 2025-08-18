class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0 ){
            int t1=matrix[i][j];
            if(t1<target) i++;
            else if(t1>target) j--;
            else if(t1==target) return true;

        }
        return false;
    }
}