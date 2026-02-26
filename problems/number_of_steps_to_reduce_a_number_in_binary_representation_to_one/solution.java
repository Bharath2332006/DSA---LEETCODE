class Solution {
    public int numSteps(String s) {
       ArrayList<Character> arr=new ArrayList<>();
       for(char c: s.toCharArray()) arr.add(c);
       int count=0;
       while(arr.size()>1){
            if(arr.get(arr.size()-1)=='1'){
                count++;
                int i=arr.size()-1;
                while(true){
                    if(i<0){
                        arr.add(0,'1');
                        break;
                    }
                    if(arr.get(i)!='0'){
                        arr.set(i,'0');
                        i--;
                    }
                    else{
                        arr.set(i,'1');
                        break;
                    }
                }

            }else{
                arr.remove(arr.size()-1);
                count++;
            }
       }
       return count;
    }

}