class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0], count = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        while (count < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (sum == nums[i]) {
                    sum++;
                }
            }
            count++;
        }
        return sum;
    }
}