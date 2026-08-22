class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for (int i = 2; i < n; i++) {
            if (arr2.get(arr2.size()-1) > arr1.get(arr1.size() - 1)) {
                arr2.add(nums[i]);
            } else {
                arr1.add(nums[i]);
            }
        }

        int[] res = new int[n];
        System.arraycopy(arr1.stream()
                .mapToInt(Integer::intValue).toArray(), 0, res, 0, arr1.size());
        System.arraycopy(arr2.stream()
                .mapToInt(Integer::intValue).toArray(), 0, res, arr1.size(), arr2.size());
        return res;

    }
}