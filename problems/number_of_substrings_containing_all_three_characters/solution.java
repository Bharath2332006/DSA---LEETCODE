class Solution {
    public int numberOfSubstrings(String s) {
        int i=0,j=0;
        int ca=0,cb=0,cc=0;
        int res=0;
        while(j<s.length())
        {
            if(s.charAt(j)=='a')
            ca++;
            if(s.charAt(j)=='b')
            cb++;
            if(s.charAt(j)=='c')
            cc++;

            while(ca>0 && cb>0 && cc>0)
            {
                res+=s.length()-j;
                 if(s.charAt(i)=='a')
                 ca--;
                if(s.charAt(i)=='b')
                 cb--;
                if(s.charAt(i)=='c')
                 cc--;
                 i++;

            }
            j++;
        }
        return res;
    }
}

        