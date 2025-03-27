class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set=new HashSet<>();
        for(char in:sentence.toCharArray()){
            set.add(in);
            if(set.size()==26) return true;
        }

        return false;

    }
}