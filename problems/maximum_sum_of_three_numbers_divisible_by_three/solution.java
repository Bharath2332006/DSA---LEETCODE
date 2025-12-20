class Solution {
    public int maximumSum(int[] nums) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        ArrayList<Integer> arr3=new ArrayList<>();

        for(int n:nums){
            if(n%3==0) arr1.add(n);
            else if(n%3==1) arr2.add(n);
            else arr3.add(n);
        }
        Collections.sort(arr1,Collections.reverseOrder());
        Collections.sort(arr2,Collections.reverseOrder());
        Collections.sort(arr3,Collections.reverseOrder());

        int max=0;
        if(arr1.size()>=3){
            max=Math.max(max,arr1.get(0)+arr1.get(1)+arr1.get(2));
        }
        
        if(arr2.size()>=3){
            max=Math.max(max,arr2.get(0)+arr2.get(1)+arr2.get(2));
        }
        
        if(arr3.size()>=3){
            max=Math.max(max,arr3.get(0)+arr3.get(1)+arr3.get(2));
        }
        if(arr1.size()>=1 && arr2.size()>=1 && arr3.size()>=1)
             max=Math.max(max,arr1.get(0)+arr2.get(0)+arr3.get(0));
        


        return max;
    }
}