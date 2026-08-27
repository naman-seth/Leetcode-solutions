class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0, prod = 1;
        int ori = n;

        while (n > 0) {
            int digit = n % 10;
            s += digit;
            prod *= digit;
            n /= 10;
        }

        /*if (s == 0 || prod == 0)
            return false;
*/
        return (ori % (s + prod) == 0);
    }
}
