class Solution {
    public int missingMultiple(int[] nums, int k) {
        Map<Integer, Integer> check = new HashMap<>();
        int n = nums.length;
        for (int num : nums) {
            check.put(num, check.getOrDefault(num, 0) + 1);
        }
        boolean found = true;
        int num = k;
        while (found) {
            if(check.containsKey(num)){
                num+=k;
            }else{
                found=false;
            }
        }
        return num;

    }
}