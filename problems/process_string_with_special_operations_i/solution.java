class Solution {
    public String processStr(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetter(c)) {
                arr.add(c);
            }
            else if(c=='*') {
                if(!arr.isEmpty())arr.remove(arr.size()-1);
            }

            else if(c=='#'){
                arr.addAll(new ArrayList<>(arr));
            }
            else if(c=='%'){
                Collections.reverse(arr);
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(char c: arr){
            sb.append(c);
        }
        return sb.toString();
    }
}