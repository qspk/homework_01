import java.util.Scanner;

public class Day02_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚年龄:");
        int hs1 = sc.nextInt();
        System.out.println("请输入第二个和尚年龄:");
        int hs2 = sc.nextInt();
        System.out.println("请输入第三个和尚年龄:");
        int hs3 = sc.nextInt();
        int max = (hs1 > hs2 ? hs1 : hs2) > hs3 ? (hs1 > hs2 ? hs1 : hs2) : hs3;
        int min = (hs1 < hs2 ? hs1 : hs2) < hs3 ? (hs1 > hs2 ? hs1 : hs2) : hs3;
        int mid = hs1 + hs2 + hs3 - max - min;
        System.out.println(max+"岁是最大年龄,获得五彩仙衣一件!");
        System.out.println(mid+"岁排第二,获得旧棕衣一件!");
        System.out.println(min+"岁是最小年龄,获得锦澜袈裟一件!");
    }
}
