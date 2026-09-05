class Solution {
    public int search(int[] nums, int target) {
       int low=0;
       int n = nums.length;
       int high = n-1;
       while(low<=high){
        int mid = (low +high)/2;
        int a = nums[mid];
        if(a==target){
            return mid;
        }else if(a<target){
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return -1;
    }
}