class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[n];
                nums[n] = temp;
                n++;
            }
        }
        return n;
    }
}