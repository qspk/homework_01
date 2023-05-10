import java.util.Scanner;

public class Day08_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("相信你的评论一定可以一针见血");
        String s = sc.nextLine();
        s = keywordMask(s);
        System.out.println(s);
    }

    public static String keywordMask(String s) {
        String[] keys = {"sb", "Sb", "sB", "SB", "tmd", "Tmd", "TMD", "tMd", "tmD", "TMd", "TmD", "tMD", "sha蛋", "傻蛋", "傻dan"};
        for (String key : keys) {
            if (s.contains(key)) {
                s = s.replace(key, "**");
            }
        }
        return s;
    }
/*
    public static void keywordMask(String s) {
        String[] keys = {"sb", "Sb", "sB", "SB", "tmd", "Tmd", "TMD", "tMd", "tmD", "TMd", "TmD", "tMD", "sha蛋", "傻蛋", "傻dan"};
        for (String key : keys) {
            if (s.contains(key)) {
                s = s.replace(key, "**");
            }
        }
    }

*/

}
