class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        permutation(res,nums,0);
        return res;
    }
    public void  permutation(List<List<Integer>> res,int arr[],int inx){
        if(inx==arr.length){
            res.add(convtArrToList(arr));
            return;
        }
        for(int i=inx;i<arr.length;i++){
            swap(arr,inx,i);
            permutation(res,arr,inx+1);
            swap(arr,inx,i);
        }
    }
    public List<Integer> convtArrToList(int arr[]){
            List<Integer> list=new ArrayList<>();
            for(int num:arr){
                list.add(num);
            }
            return list;
    }
    public int[] swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }

    
}