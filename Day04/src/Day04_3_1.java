import java.util.Random;

public class Day04_3_1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[30];
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            arr[i] = r.nextInt(100) + 1;
            //大于等于5g能量小明都会偷走
            if (arr[i] >= 5) {
                sum += arr[i];
            }
        }
        System.out.println("小明偷了"+sum+" g能量");
    }
}
