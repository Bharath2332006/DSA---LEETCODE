class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[]=new int[2];
        int i=0,j=numbers.length-1;
        int sum=Integer.MIN_VALUE;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum>target) j--;
            else if(sum<target)i++;
            else{
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
        }return arr;
    }
}