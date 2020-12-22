package array;

/**
 * @author Coco
 * @date 2020/12/22
 * @des 自定义数组的工具类
 */
public class ArrayUtils {
    //求数组的最大值
    public int getMax(int[] arr) {
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    //最小值
    public int getMin(int[] arr) {
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    //总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //平均值
    public int getAvg(int[] arr) {
        int sum = getSum(arr);
        return sum / arr.length;
    }

    //反转数组
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组排序【冒泡排序】
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //遍历数组
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    //查找指定元素【线性查找】
    public int getIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        //返回-1表示未找到指定元素
        return -1;
    }
}
