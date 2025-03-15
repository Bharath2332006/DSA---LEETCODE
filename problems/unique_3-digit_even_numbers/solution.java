class Solution {
    public int totalNumbers(int[] digits) {
        int n= digits.length;
        int count=0;
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]!=0){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        for(int k=0;k<n;k++){
                            int num=Integer.parseInt((digits[i]+""+digits[j]+""+digits[k]));
                            if(i!=j&&j!=k&&i!=k&&num%2==0&&!s.contains(num)){
                                s.add(num);
                                count++;
                            }
                        }
                    }
                }
            }
        }
        return count;

        
    }
}