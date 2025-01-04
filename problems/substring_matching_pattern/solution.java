class Solution {
    public boolean hasMatch(String s, String p) {
        int index=p.indexOf("*");
        int b=s.indexOf(p.substring(0,index));
        int a=s.indexOf(p.substring(index+1),b+index);
        if(b!=-1 && a!=-1) return true;
        return false;
            
        
        
    }
}