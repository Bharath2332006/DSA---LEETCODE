class Solution {
    public char findTheDifference(String s, String t) {
		 StringBuilder a=new StringBuilder();
         int n=t.length();
         char []c1=s.toCharArray();
         Arrays.sort(c1);
         
         char []c2=t.toCharArray();
         Arrays.sort(c2);
         for(int i=0;i<s.length();i++){
            if(c1[i]!=c2[i]){
                return c2[i];
            }
         }
         return c2[n-1];
         
         
    }
}