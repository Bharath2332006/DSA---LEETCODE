class Solution {
    public int maxProduct(int n) {
        int max1=0,max2=0;
        int d=n;
        while(d>0){
            int a=d%10;
            if(a==max1) max2=a;
            if(a>max1){
                max2=max1;
                max1=a;
            }else if(a<max1 && a>max2) max2=a;
            d/=10;
        }
        return max1*max2;
    }
}