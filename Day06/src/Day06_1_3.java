import java.util.Scanner;

public class Day06_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integral = 1000;
        double money = 500;
        while (true) {
            System.out.println("请选择付款类型: 0:普通顾客,1:会员顾客");
            int type = sc.nextInt();
            switch (type) {
                case 0:
                    System.out.println("请输入付款金额(元):");
                    double consumption1 = sc.nextDouble();
                    payment(consumption1, money);
                    break;
                case 1:
                    System.out.println("请输入付款金额(元):");
                    double consumption2 = sc.nextDouble();
                    payment(consumption2, integral, money);
                    break;
            }
        }
    }

    public static void payment(double consumption, double money) {
        System.out.println("付款成功");
        System.out.println("本次消费" + consumption + "元,收您:" +
                money + "元,找零:" + (money - consumption) + "元。");
    }

    public static void payment(double consumption, int integral, double money) {
        if (consumption * 10 <= integral) {
            System.out.println("付款成功");
            System.out.println("您本次一共消费:" + consumption + "元");
            System.out.println("您的账户剩余积分:" + (integral - consumption * 10));
            System.out.println("您的账户余额为:" + money + "元");
        } else {
            int integral1 = (int) (((consumption - integral / 10) / 100)) * 500;
            System.out.println("付款成功");
            System.out.println("您本次一共消费:" + consumption + "元");
            System.out.println("您的账户剩余积分:" + integral1);
            System.out.println("您的账户余额为:" + (money - (consumption - integral / 10)) + "元");
        }

    }
}
