class Solution {
    public char processStr(String s, long k) {
        long currlen=0;
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                currlen++;
            }
            else if( c=='*'){
                    currlen=Math.max(0,currlen-1);
            }
            else if(c =='#'){
                currlen*=2;
            }
        }
        if(k<0 || k>=currlen) return '.';
        char arr[]=s.toCharArray();
        for(int i=arr.length-1;i>=0;i--){
            char c=arr[i];
            if( c=='%'){
                k=currlen-1-k;
            }
            else if( c=='*'){
                currlen++;
            }
            else if(c =='#'){
                 long half=currlen/2;
                if(k>=half) k-=half;
                currlen=half;
            }else if(Character.isLetter(c)){
                if(k==currlen-1) return c;
                currlen--;
            }
        }
        return '.';
    }
}