class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            else {
             if(stack.isEmpty()) return false;
                char cur=stack.pop();
                if( (c==')' && cur!='(') || (c=='}' && cur!='{') || (c==']' && cur!='['))return false; 

                
                
            }
        }
        return stack.isEmpty();
    }
}