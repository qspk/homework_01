import java.util.Scanner;

public class Day04_3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + (i + 1) + "门课程成绩");
            arr[i] = sc.nextInt();
        }
        int max, min, sum;
        max = min = sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        int avg = sum / arr.length;
        System.out.println("最高成绩为: " + max);
        System.out.println("最低成绩为: " + min);
        System.out.println("平均成绩为: " + avg);
    }
}
