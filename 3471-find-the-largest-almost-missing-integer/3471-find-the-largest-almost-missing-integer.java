class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Integer> cnt = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> set = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }
            for (int num : set) {
                cnt.put(num, cnt.getOrDefault(num, 0) + 1);
            }
        }
        int ans = -1;
        for (int num : cnt.keySet()) {
            if (cnt.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}