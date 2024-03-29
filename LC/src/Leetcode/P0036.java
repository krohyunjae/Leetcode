package Leetcode;

import java.util.*;

public class P0036 {
    /**
     * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
     *
     * Each row must contain the digits 1-9 without repetition.
     * Each column must contain the digits 1-9 without repetition.
     * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
     * Note:
     *
     * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
     * Only the filled cells need to be validated according to the mentioned rules.
     */

    public boolean isValidSudoku(char[][] board) {
        // Check if the row/column and each 3*3 cell contain the same number
        boolean[][] col = new boolean[9][9];
        boolean[][] row = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0' - 1;
                    int k = (i/3) * 3 + j/3;
                    if(row[i][num] || col[j][num] || box[k][num]) return false;
                    row[i][num] = col[j][num] = box[k][num] = true;
                }
            }
        }
        return true;
    }

    public boolean isValidSequence(char[] sequence) {
        Set<Character> validSequence = new HashSet<>(Arrays.asList('1','2','3','4','5','6','7','8','9'));
        if(Arrays.asList(sequence).containsAll(validSequence))
            return true;
        return false;
//        for (int i = 0; i < 9; i++) {
//            if(validSequence.contains(sequence[i])) {
//                validSequence.
//            }
//        }
    }
}
