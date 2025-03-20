class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int arr[]=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++){
            while((!s.empty())&&temperatures[i]>temperatures[s.peek()]){
                int ind=s.pop();
                arr[ind]=i-ind;
            }s.push(i);
        }return arr;
    }
}