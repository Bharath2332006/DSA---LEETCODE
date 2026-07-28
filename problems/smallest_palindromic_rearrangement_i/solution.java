class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            int inx=s.charAt(i)-97;
            arr[inx]++;
        }
        char c[]=new char[s.length()];
        int l=0,r=c.length-1;
        for(int i=0;i<26;i++){
            if(arr[i]>0 && arr[i]%2==0){
                int mid=arr[i]/2;
                for(int j=1;j<=mid;j++){
                    c[l]=(char)('a'+i);
                    c[r]=(char)('a'+i); 
                    l++;
                    r--;
                }
            }
            else if(arr[i]>0 && arr[i]%2!=0){
                int mid=c.length/2;
                c[mid]=(char)('a'+i);
                int ethana=arr[i]/2;
                for(int j=1;j<=ethana;j++){
                    c[l++]=(char)('a'+i);
                    c[r--]=(char)('a'+i);
                }
            }
        }
        return new String(c);
    }
}