class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         // last index
        int last = m + n -1;

        // merge in the reverse order since m and n are already sorted
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[last] = nums1[m-1];
                m--;
            }else{
                nums1[last] = nums2[n-1];
                n--;
            }
            last --;
        }

        // Fill nums1 with the left over elements from nums2
        while(n>0){
            nums1[last] = nums2[n-1];
            n --;
            last --;
        }
    }
}