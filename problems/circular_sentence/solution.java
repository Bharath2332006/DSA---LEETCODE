class Solution {
    public boolean isCircularSentence(String str) {
        String arr[]=str.split(" ");
        if(str.charAt(0)!=str.charAt(str.length()-1))
            return false;

        for(int i=0;i<arr.length-1;i++){
            String s1=arr[i];
            String s2=arr[i+1];
            if(s1.charAt(arr[i].length()-1)!=s2.charAt(0)){
                return false;
            }
        }return true;
        
    }
}