// N Queens problem

import java.util.*;
public class Nqueens {

    // Check if placing queen at (row, col) is safe
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    // Save the current board into results
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += "Q";
                } else {
                    row += ".";
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Recursive helper
    public void helper(char[][] board, List<List<String>> allBoards, int row) {
        if (row == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';       // Place queen
                helper(board, allBoards, row + 1);
                board[row][col] = '.';       // Backtrack
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Nqueens nq = new Nqueens();
        List<List<String>> solutions = nq.solveNQueens(4);

        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
