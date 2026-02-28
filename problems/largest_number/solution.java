class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> arr=new ArrayList<>();
        for(int a:nums) arr.add(Integer.toString(a));

        Collections.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr.get(0).equals("0")) return "0";
        StringBuilder str=new StringBuilder();
        for(String s: arr) str.append(s);

        return str.toString();
    }
}