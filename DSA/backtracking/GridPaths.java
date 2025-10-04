// Count Paths in a Grid- Down and Right

public class GridPaths {

    public static int countPaths(int row, int col, int n, int m) {
        if (row == n - 1 && col == m - 1) {
            return 1;
        }

        if (row >= n || col >= m) {
            return 0;
        }

        return countPaths(row + 1, col, n, m) + countPaths(row, col + 1, n, m);
    }

    public static void main(String[] args) {
        int n = 2, m = 2;
        int totalPaths = countPaths(0, 0, n, m);
        System.out.println("Number of paths: " + totalPaths);
    }
}
