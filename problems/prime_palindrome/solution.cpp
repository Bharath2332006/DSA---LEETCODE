class Solution {
public:
    bool isPrimePalin(int x) {
        if (x < 2) return false;

        string s = to_string(x), t = s;

        reverse(t.begin(), t.end());

        if (t != s) return false;
        

        
        if (x % 2 == 0) return x == 2;

        for (int i = 3; i * i <= x; i += 2) {
            if (x % i == 0) return false;
        }

        return true;
    }
    int primePalindrome(int n) {
        
        while (true) {
            if (isPrimePalin(n)) return n;

            if (n > 1e7 && n < 1e8) n = 1e8; //100030008
            cout << n;
            //10000007 - 100000008

            n++;
        }
    }
};