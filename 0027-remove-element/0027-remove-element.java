class Solution {
    public int removeElement(int[] nums, int val) {
        int boundary = nums.length-1;
        int k=0;
        while(k<=boundary){
            if(nums[k]==val){
                swap(nums,k,boundary);
                boundary-=1;
            }else{
                k+=1;
            }
        }
        return k;
    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}