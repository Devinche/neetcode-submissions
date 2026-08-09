class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] rowSet = new HashSet[9];
        HashSet<Character>[] colSet = new HashSet[9];
        HashSet<Character>[] squareSet = new HashSet[9];

        for (int i = 0; i < 9; i++) {

            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            squareSet[i] = new HashSet<>();
            
        }

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char value = board[row][col];
                
                if (value == '.') continue;

                int squareIndex = (row / 3) * 3 + (col / 3);

                if (rowSet[row].contains(value) || colSet[col].contains(value)
                    || squareSet[squareIndex].contains(value)) {

                        return false;
                }

                rowSet[row].add(value);
                colSet[col].add(value);
                squareSet[squareIndex].add(value);
            }
        }

        return true;
    }
}
