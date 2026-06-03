class Solution {
    public int digitFrequencyScore(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int a=n;
        while(a>0){
            int d=a%10;
            map.put(d,map.getOrDefault(d,0)+1);
            a/=10;
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            sum+=(m.getKey()*m.getValue());
        }
        return sum;
    }
}