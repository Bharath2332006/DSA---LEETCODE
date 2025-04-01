class Solution {
    public int similarPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            String w1=words[i];
            int f1[]=new int[26];

            for(int a=0;a<w1.length();a++){
                char ch =w1.charAt(a);
                f1[ch-'a']++;
            }
            for(int j=i+1;j<words.length;++j){
                String w2=words[j];
                int[] f2=new int[26];
                for(int b=0;b<w2.length();b++){
                    char ch=w2.charAt(b);
                    f2[ch-'a']++;
                }
                boolean fl=true;
                for(int k=0;k<26;k++){
                    if((f1[k]>0 && f2[k]==0) || (f2[k]>0 && f1[k]==0 )){
                      fl=false;
                      break;
                    }
                }if(fl) count++;
            }
           // if(fl) count++;
        }
        return count;
        
    }
}