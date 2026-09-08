class Solution {
    public int findMin(int[] nums) {
       int left=0;
       int right=nums.length-1;
       int res=nums[0];
       while(left<=right){
        int mid=left+(right-left)/2;
        if(nums[mid]>=res){
            left=mid+1;
        }else{
            res=nums[mid];
            right=mid-1;
        }
       }
       return res;
    }
}