class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int windowSum = 0;
        int min = Integer.MAX_VALUE;

        for(int right=0; right<nums.length; right++){
            windowSum += nums[right];

            while(windowSum >= target){
                min = Math.min(min, right-left+1);
                windowSum -= nums[left];
                left++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}