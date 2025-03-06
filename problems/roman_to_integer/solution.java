class Solution {
    public int romanToInt(String s) {
        int nums=0;
        s = s.replace("IV","IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                nums+=1;
            }else if(s.charAt(i)=='V'){
                nums+=5;
            } else if(s.charAt(i)=='X'){
                nums+=10;
            }else if(s.charAt(i)=='L'){
                nums+=50;
            }else if(s.charAt(i)=='C'){
                nums+=100;
            }else if(s.charAt(i)=='D'){
                nums+=500;
            }else if(s.charAt(i)=='M'){
                nums+=1000;
            }else{
                nums+=0;
            }
        }
        return nums;
    }
}