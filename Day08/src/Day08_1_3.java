import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Day08_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String checkCode = getCheckCode();
        boolean flag;
        do {
            System.out.println("当前验证码为:" + checkCode);
            System.out.println("请输入验证码:");
            String code = sc.next();
            flag = compareCode(code, checkCode);
        } while (!flag);

    }

    public static String getCheckCode() {
        String upCode = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowCode = upCode.toLowerCase(Locale.ROOT);
        String numberCode = "0123456789";
        StringBuilder sb = new StringBuilder(upCode);
        sb.append(lowCode).append(numberCode);
        Random r = new Random();
        String s = sb.toString();
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(62);
            code.append(s.charAt(index));
        }
        return code.toString();
    }

    public static boolean compareCode(String code, String checkCode) {
        if (code.equalsIgnoreCase(checkCode)) {
            System.out.println("验证正确...");
            return true;
        } else {
            System.out.println("验证失败,请重新输入");
            return false;
        }
    }
}
