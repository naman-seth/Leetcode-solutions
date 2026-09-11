class Solution {
    public int findMiddleIndex(int[] nums) {
        int left=0;
        int right=0;
        int n = nums.length;
        for(int i=n-1;i>0;i--){
            right+=nums[i];
        }
        for(int mid=0;mid<n;mid++){
            if(left==right){
                return mid;
            }
            left+=nums[mid];
            if(mid+1<n){
                right-=nums[mid+1];
            }
            
        }
        return -1;
    }
}