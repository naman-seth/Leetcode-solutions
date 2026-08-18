class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int a = digits.length - 1; a >= 0; a--) {
            if (digits[a] < 9) {
                digits[a]++;
                return digits;
            }
            digits[a] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }

}