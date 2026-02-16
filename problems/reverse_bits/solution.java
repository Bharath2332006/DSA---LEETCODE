class Solution {
    public int reverseBits(int n) {
        char c1[] = new char[32];
        Arrays.fill(c1, '0'); 
        
        String s = Integer.toBinaryString(n);
        int charIndex = s.length() - 1;
        for (int i = 31; i >= 0 && charIndex >= 0; i--) {
            c1[i] = s.charAt(charIndex--);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 31; i >= 0; i--) {
            ans.append(c1[i]);
        }
        return (int) Long.parseLong(ans.toString(), 2);
    }
}