class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i=0;
        int j=i+1;
        int n=nums.length;
        while(i<n && j<n){
            if(nums[i]%2!=0 && nums[j]%2==0){
                int temp = 0;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            } else if(nums[i]%2==0){
                i++;
                j++;
            } else {
                j++;
            }
        }
        return nums;
    }
}