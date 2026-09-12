class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int posN = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                posN++;
            }
        }
        int[] pos = new int[posN];
        int[] neg = new int[n - posN];
        int posP = 0;
        int negP = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                pos[posP] = nums[i];
                posP++;
            } else {
                neg[negP] = nums[i];
                negP++;
            }
        }
        posP = 0;
        negP = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                nums[i] = pos[posP++];
            } else if (i % 2 == 0) {
                nums[i] = pos[posP++];
            } else {
                nums[i] = neg[negP++];
            }
        }
        return nums;

    }
}