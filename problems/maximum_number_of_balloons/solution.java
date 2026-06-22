class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer> map=new HashMap<>();
        for(char c:text.toCharArray()){
            if(c=='b' || c== 'a' || c== 'l' || c=='o' || c== 'n') map.put(c,map.getOrDefault(c,0)+1);
        }
        if(map.size()<5) return 0;
        int max=99999;
        map.put('l',map.get('l')/2);
        map.put('o',map.get('o')/2);

        for(Map.Entry<Character,Integer> ent:map.entrySet()){

            //if(ent.get('l')<2 || ent.get('o')<2){
            //    return 0;
            //}
            max=Math.min(max,ent.getValue());
        }
        return max;
    }
}