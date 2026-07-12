class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int a[]=arr.clone();
        Arrays.sort(a);
        HashMap<Integer,Integer> map=new HashMap<>();
        int r=1;
        for(int num:a){
            if(!map.containsKey(num)) map.put(num,r++);
        }
        for(int i=0;i<arr.length;i++){
            a[i]=map.get(arr[i]);
        }
        return a;
    }
}