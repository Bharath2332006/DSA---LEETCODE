class Solution {
    public String sortSentence(String s) {
        String[] s1=s.trim().split(" ");
        String []arr=new String[s1.length]; 
        for(int i=0;i<s1.length;i++){
            int num=s1[i].charAt(s1[i].length()-1)-'0';  
            String w=s1[i].substring(0,s1[i].length()-1);
            arr[num-1]=w;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length-1;i++){
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[arr.length-1]);
        return sb.toString();

        
    }
}