package array;

/**
 * @author Coco
 * @date 2020/12/22
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int[] arr = {50, 878, 11, 42, 852, 132, 177, 1385};
        utils.print(arr);
        utils.sort(arr);
        utils.print(arr);
    }


}
