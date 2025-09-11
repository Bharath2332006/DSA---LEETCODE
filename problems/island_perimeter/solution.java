class Solution {
    public int islandPerimeter(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int side=4;
                if(grid[i][j]==1){
                    if(i>0  && grid[i-1][j]==1) side--;
                    if(i<grid.length-1 && grid[i+1][j]==1) side--;
                    if(j>0 && grid[i][j-1]==1) side--;
                    if(j<grid[i].length-1 && grid[i][j+1]==1) side--;
                    count+=side;
                }
                
            }
        }
        return count;
    }
}