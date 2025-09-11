class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(res,nums,0);
        return res;
    }
    public void permutation(List<List<Integer>> res, int arr[],int inx){

        if(inx==arr.length ){
            List<Integer> lst=new ArrayList<>();
            for(int nums:arr){
                lst.add(nums);
            }
            res.add(lst);
            return;
        }
        Set<Integer> set=new HashSet<>();
        for(int i=inx;i<arr.length;i++){
            if(set.contains(arr[i]))continue;
            set.add(arr[i]);
            swap(arr,inx,i);
            permutation(res,arr,inx+1);
            swap(arr,inx,i);
        }
        
    }
    public int[] swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
}