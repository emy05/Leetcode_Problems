class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> result = new ArrayList<>();

        // initialize two pointer i and j
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i][0] < nums2[j][0]){
                result.add(nums1[i]);
                i++;
            }else if(nums1[i][0] > nums2[j][0]){
                result.add(nums2[j]);
                j++;
            }else{
                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
        }

        // Add remaining elements from nums1, if any
        while(i < nums1.length){
            result.add(nums1[i]);
            i++;
        }

        // Add remaining elements from nums2, if any
        while(j < nums2.length){
            result.add(nums2[j]);
            j++;
        }
        return result.toArray(new int[result.size()][]);
    }
}