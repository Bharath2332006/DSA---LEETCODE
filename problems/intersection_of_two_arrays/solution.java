class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            if(s1.contains(num)){
                s2.add(num);
            }
        }
        for(int num:s2){
            arr.add(num);
        }
        int n=arr.size();
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=arr.get(i);
        }
        return arr1;
        


    }
}