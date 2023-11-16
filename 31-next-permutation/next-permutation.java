class Solution {
    public void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;       //break point;
                break;        
            }
        }

        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }

        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }

        reverse(nums,index+1,n-1);
    }

        public void reverse(int nums[],int start,int end){
            while(start<end){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end--;
            }
        }
        public void swap(int nums[],int p1,int p2){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
        }

    }
