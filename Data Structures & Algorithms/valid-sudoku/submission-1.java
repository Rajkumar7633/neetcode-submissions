class Solution {
    public boolean isValidSudoku(char[][] board) {
        // HashSet<Character>[] rows = new HashSet[9];
        // HashSet<Character>[] cols = new HashSet[9];
        // HashSet<Character>[] boxes = new HashSet[9];

        // for(int i =0;i<9;i++){
        //     rows[i] = new HashSet<>();
        //     cols[i] = new HashSet<>();
        //     boxes[i] = new HashSet<>();
        // }

        // for(int row=0;row<9;row++){
        //     for(int col =0;col<9;col++){
        //         char num  = board[row][col];
        //         if(num == '.') continue;
        //         int boxIndex = (row / 3) * 3 + (col / 3);

        //         if(rows[row].contains(num) ||
        //         cols[col].contains(num) ||
        //         boxes[boxIndex].contains(num))  return false;

        //         rows[row].add(num);
        //         cols[col].add(num);
        //         boxes[boxIndex].add(num);

        //     }
        // }

        // return true;


        // faster
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int r =0;r<9;r++){
            for(int c =0;c<9;c++){
                if(board[r][c] == '.') continue;
                int num = board[r][c] - '1';
                int box = (r / 3) * 3 + c / 3;

                if(rows[r][num] || cols[c][num] || boxes[box][num]){
                    return false;
                }

                rows[r][num] = true;
                cols[c][num] = true;
                boxes[box][num] = true;
            }
        }
        return true;
    }
}
