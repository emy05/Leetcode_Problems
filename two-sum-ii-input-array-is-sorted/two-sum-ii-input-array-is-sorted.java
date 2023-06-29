class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1=0;
        int pointer2=numbers.length-1;
        int a,b;
        while(pointer1<pointer2){
            a=numbers[pointer1];
            b=numbers[pointer2];
            if(a+b==target)
            break;
            if(a+b<target){
                pointer1++;
                continue;
            }
            pointer2--;
        }
        return new int[] {pointer1+1,pointer2+1};
    }
}