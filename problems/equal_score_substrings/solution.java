class Solution {
    public boolean scoreBalance(String s) {
        int n = s.length();
        int[] prefixSum = new int[n];
        prefixSum[0] = s.charAt(0) - 'a' + 1;
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + (s.charAt(i) - 'a' + 1);
        }

        int total = prefixSum[n - 1];
        for (int i = 0; i < n - 1; i++) {
            int left = prefixSum[i];
            int right = total - prefixSum[i];
            if (left == right) {
                return true;
            }
        }

        return false;
    }
}