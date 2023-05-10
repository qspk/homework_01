import java.util.Random;

public class Day05_1_5 {
    public static void main(String[] args) {
        int[] arr = {1, 43, 43, 5, 4, 6, 6, 7, 7, 88, 9, 9, 9, 0, 0, 9};
        int[] arr1 = replace0(arr);
        printArray(arr1);
    }
    //打印数组
    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    //替换数组中0元素
    private static int[] replace0(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = r.nextInt(10) + 1;
            }
        }
        return arr;
    }
}
