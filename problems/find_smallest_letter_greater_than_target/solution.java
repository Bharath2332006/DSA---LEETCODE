class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c=letters[0];
        for(int i=0;i<letters.length;i++){
            if(target<letters[i]){
                c=letters[i];
                return c;
            }
        }
        return c;
    }
}