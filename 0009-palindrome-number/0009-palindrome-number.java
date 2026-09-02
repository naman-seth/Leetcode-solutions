class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int n = 0;
        while (num > 0) {
            n*=10;
            n += num % 10;
            num /= 10;
        }
        if (n == x) {
            return true;
        } else {
            return false;
        }
    }
}