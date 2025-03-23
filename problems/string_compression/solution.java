class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if (n == 1)
            return 1; 

        int i = 0;
        int j = 0; 

        while (i < n) {
            char curr = chars[i]; 
            int cnt = 0; 

            while (i < n && chars[i] == curr) {
                i++;
                cnt++;
            }

            chars[j++] = curr;

            if (cnt > 1) {
                String s = Integer.toString(cnt);
                for (char c : s.toCharArray()) {
                    chars[j++] = c;
                }
            }
        }

        return j; 
    }
}