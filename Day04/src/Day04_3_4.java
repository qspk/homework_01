import java.util.Random;

public class Day04_3_4 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[7];
        //createRed 创建红球的六个数字
        creatRed(r, arr);
        arr[6] = r.nextInt(16) + 1;
        System.out.print("红球为: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("蓝球为: " + arr[6]);
    }

    private static void creatRed(Random r, int[] arr) {
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(32) + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}
