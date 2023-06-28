class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet=null;
        Set<Character> colSet=null;
        for(int i=0;i<9;i++){
            rowSet=new HashSet<>();
            colSet=new HashSet<>();
            for(int j=0;j<9;j++){
                char r=board[i][j];
                char c=board[j][i];
                if(r!='.'){
                    if(rowSet.contains(r)){
                        return false;
                    }else{
                        rowSet.add(r);
                    }
                }
                if(c!='.'){
                    if(colSet.contains(c)){
                        return false;
                    }else{
                        colSet.add(c);
                    }
                }
            }
        }

        for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                if(!checkBoard(i,j,board)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean checkBoard(int indexI,int indexJ,char[][] board){
        Set<Character> block=new HashSet<>();
        int rows=indexI+3;
        int cols=indexJ+3;
        for(int i=indexI;i<rows;i++){
            for(int j=indexJ;j<cols;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if(block.contains(board[i][j])){
                    return false;
                }
                block.add(board[i][j]);
            }
        }
        return true;
    }
}