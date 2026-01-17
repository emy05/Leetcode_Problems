class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int maxLen = 0;
        int left = 0;
        int n = nums.length;
        for(int right = 0; right<n; right++){
            if(nums[right] > threshold){
                left = right + 1;
            }

            if(right > left && nums[right] % 2 == nums[right-1] % 2){
                left = right;
            }

            if(left < n && nums[left] % 2 != 0){
                left = right + 1;
                continue;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}