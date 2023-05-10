import java.util.Random;
import java.util.Scanner;

public class Day04_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[5];
        int num = r.nextInt(9)+2;
        System.out.println("请输入5个'1-60'的整数");
        for (int i = 0; i < 5; i++) {
            System.out.println("第"+(i+1)+"个数:");
            arr[i] = sc.nextInt();
        }
        System.out.println("输入完成");
        for (int i : arr) {
            if (i % num != 0) {
                System.out.println(i+"不是"+num+"的倍数");
            }
        }
    }
}
