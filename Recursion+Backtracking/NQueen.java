import java.util.*;

public class NQueen {
    public List<List<String>> solveNqueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board
        for (char[] rows : board) {
            Arrays.fill(rows, '.');
        }

        int[] leftrow = new int[n];
        int[] lowerDiagonal = new int[2 * n - 1];
        int[] upperDiagonal = new int[2 * n - 1];

        Solve(0, board, result, leftrow, upperDiagonal, lowerDiagonal, n);
        return result;
    }

    private void Solve(int col, char[][] board, List<List<String>> result,
                       int[] leftrow, int[] upperDiagonal, int[] lowerDiagonal, int n) {

        if (col == n) {
            result.add(constructBoard(board));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (leftrow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[n - 1 + col - row] == 0) {

                board[row][col] = 'Q';
                leftrow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[n - 1 + col - row] = 1;

                Solve(col + 1, board, result, leftrow, upperDiagonal, lowerDiagonal, n);

                // backtrack
                board[row][col] = '.';
                leftrow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[n - 1 + col - row] = 0;
            }
        }
    }

    private List<String> constructBoard(char[][] board) {
        List<String> config = new ArrayList<>();
        for (char[] row : board) {
            config.add(new String(row));
        }
        return config;
    }

    public static void main(String[] args) {
        NQueen sol = new NQueen();
        int n = 4;
        List<List<String>> results = sol.solveNqueens(n);

        for (List<String> board : results) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
