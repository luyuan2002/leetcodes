package cn.xiaoyes.algorithm.sparsearray;

/**
 * 二维数组和稀疏数组的互相转换(省略将稀疏数组写出以及写入到磁盘步骤)
 */
public class SparseArray {
    public static void main(String[] args){
        // 创建原始的二位数组11 * 11
        // 0 => 表示没有棋子 1 => 黑子 2 => 蓝子
        int[][] chessArr1 = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        chessArr1[6][6] = 8;
        // 输出原始的二维数组
        System.out.println("原始的二维数组: ");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        // 将二维数组转换为稀疏数组
        // 先遍历二维数组得到非0数据的个数
        int sum = 0;// 非0元素的个数
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("sum = " + sum);

        // 创建对应的稀疏数组
        // 之所以sum + 1是因为我们需要在稀疏数组中额外存放二位数组的行数列数以及不为0的元素个数
        int[][] spareArr = new int[sum + 1][3];
        // 给稀疏数组赋值
        spareArr[0][0] = chessArr1.length;// 行数
        spareArr[0][1] = chessArr1[0].length;// 列数
        spareArr[0][2] = sum;// 有效元素个数(不为0元素个数)

        // 遍历二维数组，将非0的值存放到稀疏数组中
        // 用于记录第几个非零数据
        int count = 0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1[i].length; j++) {
                if (chessArr1[i][j] != 0){
                    count++;
                    spareArr[count][0] = i;
                    spareArr[count][1] = j;
                    spareArr[count][2] = chessArr1[i][j];
                }
            }
        }
        // 输出稀疏数组
        System.out.println("\n得到的稀疏数组为: ");
        System.out.println("row\tcol\tval");
        for (int[] data : spareArr) {
            System.out.printf("%d\t%d\t%d\t\n", data[0], data[1], data[2]);
        }


        // 将稀疏数组恢复为原始的二维数组
        // 因为二维数组的行列信息保存在稀疏数组的第一个数组内，所以直接读取数据即可
        int[][] chessArr2 = new int[spareArr[0][0]][spareArr[0][1]];

        // 读取系数数组后几行的数据，并赋给原始的二维数组
        // 从稀疏数组的第二行开始遍历
        for (int i = 1; i < spareArr.length; i++) {
            /* row col val
               1   2   1 */
            chessArr2[spareArr[i][0]][spareArr[i][1]] = spareArr[i][2];
        }
        // 输出恢复后的二维数组
        System.out.println("\n恢复后的二维数组: ");
        for (int[] row : chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
