import java.util.Scanner;

public class Day03_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("请输入瓜子数量(输入一个大于0的数)");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("输入非法!");
            System.exit(0);
        } else {
            while (num != 1) {
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                count++;
            }
        }
        System.out.println("经过了" + count + "次,瓜子数为1");
    }
}
