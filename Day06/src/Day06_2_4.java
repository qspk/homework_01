import java.util.Scanner;

public class Day06_2_4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        System.out.println("请输入一个整数数组,输入-1结束");
        System.out.println("请输入数组长度:");
        int length = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            arr[i] = sc.nextInt();
        }
        getCount(num, arr);;
    }

    public static void getCount(int num, int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (num == i) {
                count++;
            }
        }
        System.out.println(num + "在数组中出现了" + count + "次");
    }
}
