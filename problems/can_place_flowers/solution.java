class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 &&(i==0 ||  flowerbed[i-1]==0)&& (i==flowerbed.length-1 || flowerbed[i+1]==0)){
               flowerbed[i]=1;
               n--;
            }
            /*if(flowerbed[0]==0 && flowerbed[1]==0 || flowerbed.length-1==0 && flowerbed.length-2==0){
                n--;
                i++;
            }*/
           
        }
        return (n<=0);
    }
}