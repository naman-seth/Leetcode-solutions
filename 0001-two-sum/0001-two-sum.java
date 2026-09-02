class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> check = new HashMap<>(); 
       for(int i=0;i<nums.length;i++){
        int a=nums[i];
        int more=target-a;
        if(check.containsKey(more)){
            return new int[] {check.get(more),i};
        }
        check.put(a,i);
       }
       return new int[]{-1,-1};
    }
}