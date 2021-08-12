package cn.xiaoyes.algorithm.sort;

/**
 * 选择排序
 */
@SuppressWarnings("all")
public class Selection {

    /**
     * 对数组中的的元素进行排序
     * @param data
     */
    public static void sort(Comparable[] data){
        for (int i = 0; i <= data.length - 2; i++) {
            // 定义一个变量，记录最小元素的索引，默认为参与选排序的第一个元素所在的位置
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (greater(data[minIndex],data[j])){
                    minIndex = j;
                }
                // 交换最小元素所在索引minIndex处的值和第一个位置处的值
                exch(data,minIndex,i);
            }
        }
    }

    /**
     * 比较v元素是否大于w元素
     * @param v
     * @param w
     * @return
     */
    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w) > 0;
    }

    /**
     * 数组元素i和j交换位置
     * @param data
     * @param i
     * @param j
     */
    private static void exch(Comparable[] data,int i,int j){
        Comparable temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}
