class Solution {
    public boolean check(int[] nums) {
        int small = Integer.MAX_VALUE;
        int smallInd=0;
        int n= nums.length;
        int drop=0;
       for(int i=0;i<n;i++){
        if(nums[i]<small){
            small=nums[i];
            smallInd=i;
        }
       } 
       for(int i=0;i<n;i++){
        if(nums[(i+smallInd)%n]>nums[(i+smallInd+1)%n]){
            drop++;
        }
        if(drop>1){
            return false;
        }
       }
       return true;
    }
}