class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int min=99999;
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            min=Math.min(min,diff);
        }
        for(int i=1;i<arr.length;i++){
            List<Integer> temp=new ArrayList<>();
            if(arr[i]-arr[i-1]==min){
                temp.add(arr[i-1]);
                temp.add(arr[i]);
                ans.add(temp);
            }
        }
        return ans;
    }
}