class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int zeroC = 0;
        int nZero=0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroC++;
            }
        }
        for (int i = n-zeroC; i < n; i++) {
            if(nums[i]!=0){
                nZero++;
            }
        }
        return nZero;
    }
}