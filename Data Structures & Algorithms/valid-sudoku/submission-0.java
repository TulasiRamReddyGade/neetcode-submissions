class Solution {
    public boolean isValidSudoku(char[][] board) {
           // Check rows
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]!='.' && set.contains(board[i][j]))
                    return false;
                if(board[i][j]!='.'){
                    set.add(board[i][j]);
                }
            }
        }

        // Check column
        for(int i=0;i<board.length;i++){
            HashSet<Character> set = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]!='.' && set.contains(board[j][i]))
                    return false;
                if(board[j][i]!='.'){
                    set.add(board[j][i]);
                }
            }
        }
        int dimmension = board.length/3;
        for(int r=0;r<dimmension;r++) {
            for(int c=0;c<dimmension;c++) {
                HashSet<Character> set = new HashSet<>();
                for (int i = r * 3; i < 3 + r * 3; i++) {
                    
                    for (int j = c * 3; j < 3 + c * 3; j++) {
                        if(board[i][j]!='.' && set.contains(board[i][j]))
                            return false;
                        if(board[i][j]!='.'){
                            set.add(board[i][j]);
                        }
                    }
                }
            }
        }

        return  true;
    }
}
