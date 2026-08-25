class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAvg = Double.NEGATIVE_INFINITY;
        int left = 0;
        int n = nums.length;
        double summ = 0;
        for (int right = k - 1; right < n; right++) {
            if (left == 0) {
                for (int i = left; i <= right; i++) {
                    summ += nums[i];
                }
            } else {
                summ += nums[right] - nums[left - 1];
            }

            maxAvg = Math.max(maxAvg, summ/k);
            left++;
        }
        return maxAvg;
    }
}