class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
           return false;
        }
        String tem=s+s;
        return tem.contains(goal);
        
    }
}