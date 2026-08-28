class Solution {
    public int secondHighest(String s) {
        int large = -1;
        int secLarge = -1;
        int dig = 0;
        for (char ch : s.toCharArray()) {
            dig = ch - '0';
            if (ch >= '0' && ch <= '9') {
                if (dig > large) {
                    secLarge = large;
                    large = dig;
                } else if (dig > secLarge && dig < large) {
                    secLarge = dig;
                }
            }
        }
        return secLarge;
    }
}