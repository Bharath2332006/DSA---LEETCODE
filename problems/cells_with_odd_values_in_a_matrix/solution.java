class Solution {
    public int oddCells(int m, int n, int[][] indices) {
         int [][]arr=new int[m][n];
         
         for(int[] in:indices){
            int r=in[0];
            int c=in[1];
            for(int i=0;i<m;i++)
                arr[i][c]+=1;

            for(int j=0;j<n;j++) 
                arr[r][j]+=1;
            
         }
         int count=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]%2!=0) count++;
            }
         }return count;
        
    }
}