class Solution {
    public void sortColors(int[] nums) {
        int temp = 0;
        int ind = 0;
        for (int f = 0; f <= 2; f++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == f) {
                    temp = nums[ind];
                    nums[ind] = nums[i];
                    nums[i] = temp;
                    ind++;
                }
            }
        }
    }
}