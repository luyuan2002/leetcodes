package cn.xiaoyes.algorithm.day0329;

public class LeetCode463 {
    public static void main(String[] args) {
        LeetCode463 code = new LeetCode463();
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int res = code.islandPerimeter(grid);
        System.out.println(res);
    }

    public int islandPerimeter(int[][] grid) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    System.out.print("A" + " ");
                    return dfs(grid, r, c);
                }
            }
        }
        return 0;
    }

    /**
     *
     * @param grid
     * @param r 上下
     * @param c 左右
     * @return
     */
    public int dfs(int[][] grid, int r, int c) {
        // 如果为边界则会进入条件语句
        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
            return 1;
        }
        // 判断是否为水域
        if (grid[r][c] == 0) {
            return 1;
        }
        // 不是陆地
        if (grid[r][c] != 1) {
            return 0;
        }
        // 标记已经遍历过土地
        grid[r][c] = 2;
        //     上临边                    下临边                   左临边                    右临边
        return dfs(grid, r - 1, c) + dfs(grid, r + 1, c) + dfs(grid, r, c - 1) + dfs(grid, r, c + 1);
    }

    public int islandPerimeter2(int[][] grid) {
        int land = 0;
        int border = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    land++;
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        border++;
                    }
                    if (j < grid[0].length - 1 && grid[i][j + 1] == 1) {
                        border++;
                    }
                }
            }
        }
        return 4 * land - 2 * border;
    }
}
