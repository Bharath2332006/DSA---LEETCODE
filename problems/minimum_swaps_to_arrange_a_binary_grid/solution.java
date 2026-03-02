class Solution {
    public int minSwaps(int[][] grid) {
        int points[]=new int[grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]==0) points[i]++;
                else break;
            }
        }
        int total_swap=0;
        for(int i = 0; i < points.length; i++){
            int required = points.length - 1 - i;
            int j = i;

            while(j < points.length && points[j] < required){
                j++;
            }

            if(j == points.length) return -1;

            while(j > i){
                int temp = points[j];
                points[j] = points[j-1];
                points[j-1] = temp;
                total_swap++;
                j--;
            }
        }
        return total_swap;

    }
}