class Solution {
    public boolean uniqueOccurrences(int[] arr) {
          Arrays.sort(arr);
        
          int f[]=new int[arr.length];
          int inx=0,count=1;
          for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                count++;
            }else{
                f[inx++]=count;
                count=1;
            }
          }
          f[inx++]=count;
          Arrays.sort(f,0,inx);
          for(int i=1;i<inx;i++){
            if(f[i]==f[i-1]) return false;
          }

        return true;
    }
}