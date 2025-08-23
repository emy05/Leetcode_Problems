class Solution {
    public void moveZeroes(int[] nums) {
       int zerosCount = 0;
       for(int i=0;i<nums.length;i++){
         if(nums[i] == 0){
            zerosCount++;
         } else if(zerosCount > 0) {
            nums[i-zerosCount] = nums[i];
            nums[i]=0;
         }
       }
    }
}