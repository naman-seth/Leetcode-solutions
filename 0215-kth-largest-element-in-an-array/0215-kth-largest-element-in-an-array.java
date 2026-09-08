class Solution {
    public int findKthLargest(int[] nums, int k) {
        /*int n= nums.length;
        int large = n-k;
        int left=0;
        int right=n-1;
        while(left<=right){
            int pivot = partition(nums,left,right);
            if(pivot==large){
                return nums[pivot];
            }
            else if(pivot<large){
                left=pivot+1;
            }
            else{
                right=pivot-1;
            }
        }
        return -1;
    }
    private int partition(int[] nums,int left, int right){
        int piv = nums[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(nums[j]<=piv){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,right);
        return i;
    }
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;*/
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}