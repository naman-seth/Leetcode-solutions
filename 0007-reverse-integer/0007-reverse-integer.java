class Solution {
    public int reverse(int x) {
        int n = x;
        long num = 0;
        if (n > 0) {
            while (n > 0) {
                num *= 10;
                num += n % 10;
                n /= 10;
            }
        } else {
            while (n < 0) {
                num *= 10;
                num += n % 10;
                n /= 10;
            }
        }
        if(num>Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }
        return (int)num;
    }
}