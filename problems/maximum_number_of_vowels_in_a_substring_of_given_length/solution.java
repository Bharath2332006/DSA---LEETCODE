class Solution {
    public int maxVowels(String s, int k) {
        char[] ch=s.toCharArray();
        int max=0,count=0;
        for(int i=0;i<k;i++){
           if(isVowel(ch[i])) count++;
        }max=count;
        for(int i=k;i<ch.length;i++){
            if(isVowel(ch[i-k])) count--;
             if(isVowel(ch[i])) count++;

             max=Math.max(max,count);
        } 
        return max;  
        
    }
    static boolean isVowel(char c){
        return (c=='a' || c=='e' || c=='i' ||c=='o' || c=='u');
    }
}
