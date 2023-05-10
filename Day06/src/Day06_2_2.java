import java.util.Random;

public class Day06_2_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt(100) + 1;
        int num2 = r.nextInt(100) + 1;
        int sum = getSum(num1,num2);
        System.out.println(sum);
    }

    private static int getSum(int num1, int num2) {
        return num1 + num2;
    }
}
