class Solution {
    public char findKthBit(int n, int k) {
        ArrayList<Character>arr=new ArrayList<>();
        arr.add('0');
        while(n>0){
            Noperation(arr);
            n--;
        }
        return arr.get(k-1);
    }
    public void Noperation(ArrayList<Character> arr){
        int n =arr.size();
        arr.add('1');
        for(int i=n-1;i>=0;i--){
            if(arr.get(i)=='1') arr.add('0');
            else arr.add('1');
        }
    }
}