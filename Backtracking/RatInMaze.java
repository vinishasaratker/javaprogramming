import java.util.*;

public class RatInMaze {

    static void helper(int[][] mat, int r, int c, String path,
                       ArrayList<String> ans, boolean[][] vis) {

        int n = mat.length;

        // Boundary check
        if (r < 0 || c < 0 || r >= n || c >= n ||
            mat[r][c] == 0 || vis[r][c]) {
            return;
        }

        // Destination reached
        if (r == n - 1 && c == n - 1) {
            ans.add(path);
            return;
        }

        vis[r][c] = true;

        // Down
        helper(mat, r + 1, c, path + "D", ans, vis);

        // Left
        helper(mat, r, c - 1, path + "L", ans, vis);

        // Right
        helper(mat, r, c + 1, path + "R", ans, vis);

        // Up
        helper(mat, r - 1, c, path + "U", ans, vis);

        vis[r][c] = false; // Backtracking
    }

    static ArrayList<String> findPath(int[][] mat) {

        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;

        if (mat[0][0] == 0 || mat[n - 1][n - 1] == 0) {
            return ans;
        }

        boolean[][] vis = new boolean[n][n];

        helper(mat, 0, 0, "", ans, vis);

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        ArrayList<String> result = findPath(mat);

        System.out.println(result);
    }
}