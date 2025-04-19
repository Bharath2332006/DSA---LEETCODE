class Solution {
    public int countVowelSubstrings(String str) {
        int n=str.length();
        int count =0;
        
        for(int i=0;i<n;i++){
             
            if(vowels(str.charAt(i))){
                int a=0,e=0,I=0,o=0,u=0;
                for(int j=i;j<n;j++){
                    if(str.charAt(j)=='a') a++;
                    else if(str.charAt(j)=='u') u++;
                    else if(str.charAt(j)=='e') e++;
                    else if(str.charAt(j)=='i') I++;
                    else if(str.charAt(j)=='o') o++;
                    else break;
                
                if(a>0 && e>0 && I>0 && o>0 && u>0) count++;
                }
            }
        }return count;



        
    }public boolean vowels(char ch){
        return (ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u');
    }
}