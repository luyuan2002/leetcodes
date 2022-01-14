package cn.xiaoyes.algorithm.recursion;

public class MiGong {
    public static void main(String[] args) {
        // 先创建一个二位数组 模拟迷宫
        // 地图
        int[][] map = new int[8][7];
        // 使用1表示墙

        // 上下全部设置为1 也就是围墙
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        // 左右围墙
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        // 设置挡板
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("地图的情况: ");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        // 使用递归回溯算法给小球找路
//        setWay(map,1,1);
        // 使用策略2走路
        setWay2(map,1,1);
        // 输出新的地图
        System.out.println("小球走过的地图: ");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 使用回溯算法给小球找路
     * <p>
     * 从[1][1]出发
     * 如果小球找到[6][5]位置，则说明找到通路
     * 约定：当map[i][j] 为0表示该点没有走过 1表示墙 2表示通路 3已经走过 但是走不通
     * 再走迷宫时 需要确定一个策略(方法) 下 -> 右 -> 上 -> 左 如果该点走不通再回溯
     *
     * @param map 地图
     * @param i   从哪里开始找i
     * @param j   从哪里开始找j
     * @return 找到返回true否则返回false
     */
    public static boolean setWay(int[][] map, int i, int j) {
        // 道理已经ok
        if (map[6][5] == 2) {
            return true;
        } else {
            // 当前位置还未走过
            if (map[i][j] == 0) {
                // 按照策略走
                // 假设该位置是可以通的
                map[i][j] = 2;
                // 向下走
                if (setWay(map, i + 1, j)) {// 向下走
                    return true;
                } else if (setWay(map, i, j + 1)) {// 向右走
                    return true;
                } else if (setWay(map, i - 1, j)) {// 向上走
                    return true;
                } else if (setWay(map, i, j - 1)) {// 向左走
                    return true;
                }else {
                    // 说明该位置是走不通的是死路
                    map[i][j] = 3;
                    return false;
                }
            }else {// 如果[i][j] != 0 可能是1 可能是2 可能是3
                return false;
            }
        }
    }
    public static boolean setWay2(int[][] map, int i, int j) {
        // 道理已经ok
        if (map[6][5] == 2) {
            return true;
        } else {
            // 当前位置还未走过
            if (map[i][j] == 0) {
                // 按照策略走
                // 假设该位置是可以通的
                map[i][j] = 2;
                // 向下走
                if (setWay2(map, i - 1, j)) {//向上走
                    return true;
                } else if (setWay2(map, i, j + 1)) {// 向右走
                    return true;
                } else if (setWay2(map, i + 1, j)) {// 向下走
                    return true;
                } else if (setWay2(map, i, j - 1)) {// 向左走
                    return true;
                }else {
                    // 说明该位置是走不通的是死路
                    map[i][j] = 3;
                    return false;
                }
            }else {// 如果[i][j] != 0 可能是1 可能是2 可能是3
                return false;
            }
        }
    }
}
