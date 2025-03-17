class Solution {
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        String v="AEIOUaeiou";
        while(l<r){
            while(l<r && v.indexOf(c[l])==-1){
                l++;
            }
            while(l<r && v.indexOf(c[r])==-1){
                r--;
            }
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
            l++;
            r--;

        }
        String s1=s.copyValueOf(c);
        return s1;
        
    }
}