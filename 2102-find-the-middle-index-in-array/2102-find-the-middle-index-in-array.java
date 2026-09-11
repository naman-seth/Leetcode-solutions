class Solution {
    public int findMiddleIndex(int[] nums) {
        int left= 0;
        int right=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            right+= nums[i];
        }

        for(int mid=0;mid<n;mid++){
            right -= nums[mid];
            if(right== left){
                return mid;
            }
            left+= nums[mid];
        }
        return -1;
    }
}