class Solution {
    public int maximumCount(int[] nums) {
       int pos=0;
       int zeroC=0;
       int neg = 0;
       for(int i=0;i<nums.length;i++){
        int n = nums[i];
        if(n==0){zeroC++;}
        else if(n>0){
            pos++;
        }else{
            neg++;
        }
       }
       return Math.max(pos,neg); 
    }
}