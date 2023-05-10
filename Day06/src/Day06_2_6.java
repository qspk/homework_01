import java.util.Scanner;

public class Day06_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        System.out.println(num + "是" + method(num) + "位数字");
    }

    public static int method(int num) {
        int count = 1;
        if (num == 0) {
            System.out.println("0没有位数");
            System.exit(0);
        }
        if (num < 0) {
            num = -num;
        }
        while ((num /= 10) > 0) {
            count++;
        }
        return count;
    }
}
