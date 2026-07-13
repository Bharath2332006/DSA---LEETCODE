class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();
        String l=Integer.toString(low);
        int arr[]=new int[l.length()];
        //for(int i=0;i<arr.length;i++) arr[i]=l.charAt(i)-'0';
        get(arr,ans,low,high);
        return ans;

    }
    public void get(int arr[],ArrayList<Integer> ans,int low, int high){
        if(arr[arr.length-1]==9){
            arr=new int[arr.length+1];
            get(arr,ans,low,high);
            return;
        }
        int dig=0;
        arr[0]=arr[0]+1;
        for(int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+1;
        }
        for(int i=0;i<arr.length;i++){
            dig*=10;
            dig+=arr[i];
        }
        if(dig>high) return ;
        if(dig>=low && dig<=high) {
            ans.add(dig);
        }
        //arr[0]=arr[0]+1;
        get(arr,ans,low,high);



    }
}