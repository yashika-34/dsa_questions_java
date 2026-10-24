package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    /**
     * Solves the N-Queens problem using Backtracking.
     * Time Complexity: O(N!)
     * Space Complexity: O(N^2)
     */
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, solutions, n);
        return solutions;
    }

    private static void backtrack(int row, char[][] board, List<List<String>> solutions, int n) {
        if (row == n) {
            solutions.add(constructBoard(board));
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 'Q';              // Place queen
                backtrack(row + 1, board, solutions, n); // Explore next row
                board[row][col] = '.';              // Backtrack
            }
        }
    }

    private static boolean isSafe(int row, int col, char[][] board, int n) {
        // Check column upwards
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check top-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check top-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    private static List<String> constructBoard(char[][] board) {
        List<String> res = new ArrayList<>();
        for (char[] row : board) {
            res.add(new String(row));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);

        System.out.println("Total solutions for " + n + "-Queens: " + solutions.size());
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("\nSolution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
        }
    }
}
