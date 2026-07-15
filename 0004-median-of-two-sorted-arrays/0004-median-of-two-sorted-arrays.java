class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length + nums2.length];
        int current = 0;
        for (int num : nums1) {
            res[current++] = num;
        }

        for (int num : nums2) {
            res[current++] = num;
        }
        Arrays.sort(res);
        if (current % 2 == 0) {
            double a = res[(current / 2) - 1];
            double b = res[(current / 2)];
            return (a + b) / 2;
        } else {
            return res[((current + 1) / 2) - 1];
        }
    }
}