import java.util.Scanner;

public class Day06_1_1 {
    public static void main(String[] args) {
        int[] ages = registering();
        double avg = getAvg(ages);
        System.out.println("学生平均年龄为: " + avg + "岁");
    }

    //登记学生年龄
    public static int[] registering() {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int[] ages = new int[5];
        while (i <= 5) {
            System.out.println("请输入第" + i + "名学生的年龄:");
            int age = sc.nextInt();
            if (age < 3 || age > 5) {
                System.out.println("输入有误,请输入[3,5]范围内的年龄:");
                continue;
            }
            ages[i - 1] = age;
            i++;
        }
        return ages;
    }

    //计算年龄平均值
    public static double getAvg(int[] ages) {
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        return 1.0 * sum / ages.length;
    }
}
