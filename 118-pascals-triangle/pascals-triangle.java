class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=numRows;row++){
             List<Integer> tempList = new ArrayList<>();
             for(int col=1;col<=row;col++){
                 tempList.add(ncr(row-1,col-1));
             }
             ans.add(tempList);
        }
        return ans;
    }

    public static int ncr(int n,int r){
        long result = 1;
        for(int i=0;i<r;i++){
            result = result*(n-i);
            result = result/(i+1);
        }
        return (int)result;
    }
}