import java.util.Random;
import java.util.Scanner;

public class Day04_1_5 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int count =0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(21) + 20;
        }
        System.out.println("请输入一个 20-40 之间的整数:");
        int num= sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        System.out.println(num+"在数组中出现"+count+"次");
    }
}