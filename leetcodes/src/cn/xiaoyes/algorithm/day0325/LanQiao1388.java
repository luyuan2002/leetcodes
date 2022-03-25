package cn.xiaoyes.algorithm.day0325;

public class LanQiao1388 {
    //全排列+剪枝+DFS
    static boolean[] vis = new boolean[14];
    static int[] b = new int[14];
    static int ans = 0;

    public static void main(String[] args) {
        dfs(1, 14);
        System.out.println(ans);
    }

    private static void dfs(int l, int r) {
        if (l == r) {
            ans++;
        }
        if (l >= 4 && b[1] + b[2] != b[3]) return;
        if (l >= 7 && b[4] - b[5] != b[6]) return;
        if (l >= 10 && b[7] * b[8] != b[9]) return;
        if (l >= 13 && b[10] != b[12] * b[11]) return;
        for (int i = 1; i < r; i++) {
            if (vis[i]) continue;
            vis[i] = true;
            b[l] = i;
            dfs(l + 1, r);
            vis[i] = false;
        }
    }

}
