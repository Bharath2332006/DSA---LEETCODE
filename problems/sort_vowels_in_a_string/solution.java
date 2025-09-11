class Solution {
    public String sortVowels(String s) {
                StringBuilder sv = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isvowel(s.charAt(i))) {
                sv.append(s.charAt(i));
            }
        }
        
        char[] arr = sv.toString().toCharArray();
        Arrays.sort(arr);
        
        int inx = 0;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (isvowel(s.charAt(i))) {
                res.append(arr[inx++]);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();

    }
     public boolean isvowel(char c){
        if(c=='A' || c=='E'|| c=='I'|| c=='O'|| c=='U'|| c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')return true;
        return false;
    }
}