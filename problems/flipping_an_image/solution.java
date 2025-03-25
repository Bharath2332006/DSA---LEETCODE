class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image [0].length;

        int[][]arr=new int[r][c];

        for(int i=0;i<image.length;i++){
            int j1=0;
            for(int j= image[0].length-1;j>=0;j--){
                arr[i][j1]=image[i][j];
                j1++;
             }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0)
                    arr[i][j]=1;
                
                else
                    arr[i][j]=0;
            }
        }
        return arr;
    }
}