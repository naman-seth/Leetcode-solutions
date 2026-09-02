class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int write =1;
        for(int read=0;read<n-1;read++){
            if(nums[read]!=nums[read+1]){
                nums[write]=nums[read+1];
                write++;
            }
        }
        return write;
    }
}