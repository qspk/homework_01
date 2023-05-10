import java.util.Scanner;

public class Day04_2_6 {
    public static void main(String[] args) {
        int[] arr0 = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] arr = new int[11];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] < num) {
                arr[i] = arr0[i];
                index = i;
            } else {
                arr[i + 1] = arr0[i];
            }
        }
        arr[index+1] = num;
        System.out.println("旧数组为:" + arr0);
        printArray(arr0);
        System.out.println("新数组为:" + arr);
        printArray(arr);
    }
    //打印数组
    private static void printArray(int[] arr0) {
        for (int i : arr0) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
