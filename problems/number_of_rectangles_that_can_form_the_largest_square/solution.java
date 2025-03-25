class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int arr[]=new int [rectangles.length];
        for(int i=0;i<rectangles.length;i++){
            int high=Integer.MAX_VALUE;
            for(int j=0;j<rectangles[i].length;j++){
                high=Math.min(high,rectangles[i][j]);
            }
            arr[i]=high;
        }
        int maxfre=0;
        Arrays.sort(arr);
        int highest=arr[arr.length-1];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==highest) count++;

        }
        maxfre=Math.max(count,maxfre);
        return maxfre;
    }
}