import java.util.Random;

public class Day04_3_2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {3, 1, 2, 4, 0, 0, 0, 5};
        int choice = r.nextInt(8);
        if (arr[choice] == 0) {
            System.out.println("再接再厉");
        } else {
            System.out.println("恭喜小明中得" + arr[choice] + "等奖!");
        }
    }
}
