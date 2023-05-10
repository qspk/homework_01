import java.util.Scanner;

public class Day06_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于3的整数:");
        int num = sc.nextInt();
        printEvenNumber(num);
    }

    private static void printEvenNumber(int num) {
        for (int i = 0; i <= num; i += 2) {
            System.out.println(i);
        }
    }
}
